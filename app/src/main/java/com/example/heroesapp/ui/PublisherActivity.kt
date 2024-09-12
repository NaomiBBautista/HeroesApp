package com.example.heroesapp.ui

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.heroesapp.MainActivity
import com.example.heroesapp.R
import com.example.heroesapp.adapters.PublisherAdapter
import com.example.heroesapp.models.Publisher
import com.example.heroesapp.models.User

class PublisherActivity : AppCompatActivity() {

    lateinit var username : TextView
    lateinit var  logoutBtn : ImageView
    lateinit var  publisherRecyclerView : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_publisher)

        // Prefencias de Login
        val sharedPreferences = getSharedPreferences("mypref", MODE_PRIVATE)

        // Trear los datos del usario desde el MainActivity
        val userEmail = intent.getStringExtra("userEmail")
        val user = User.staticUsers.firstOrNull{ user ->  user.email == userEmail}
        val userName = user?.name

        // Buscar elementos por ID
        username = findViewById(R.id.username)
        logoutBtn = findViewById(R.id.logoutBtn)
        publisherRecyclerView = findViewById(R.id.publisher_recyclerView)

        // Mandar el nombre del Usuario
        username.text = user?.name


        // Conectar el adaptador
        publisherRecyclerView.adapter = PublisherAdapter(Publisher.publishers){ publisher ->
            Log.i("PublisherActivity", publisher.name)
            val intent = Intent(this@PublisherActivity, HeroesActivity::class.java).apply {
                putExtra("publisherId", publisher.id)
                putExtra("userName", userName)
            }
            startActivity(intent)
        }

        // Definir como queremos que se muestre
        publisherRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        // Salir del inicio de sesión
        logoutBtn.setOnClickListener {
            val editor = sharedPreferences.edit()
            editor.remove("isLogged")
            editor.apply()

            val intent = Intent(this@PublisherActivity, MainActivity::class.java)
            startActivity(intent)
            finish()
        }


    }
}