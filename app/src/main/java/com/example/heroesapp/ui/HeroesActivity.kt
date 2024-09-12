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
import com.example.heroesapp.adapters.HeroeAdapter
import com.example.heroesapp.adapters.PublisherAdapter
import com.example.heroesapp.models.Heroe
import com.example.heroesapp.models.Publisher

class HeroesActivity : AppCompatActivity() {
    lateinit var  logoutBtn : ImageView
    lateinit var heroename : TextView
    lateinit var heroeTitle : TextView
    lateinit var  heroeRecyclerView : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_heroes)

        // Recuperar el nombre del usuario
        val userName = intent.getStringExtra("userName")
        heroeTitle = findViewById(R.id.titleHeroe)
        Log.i("HeroesActivity","Nombre del usuario: $userName")
        heroename = findViewById(R.id.username)
        heroename.text = userName

        // Obtener el id del publisher
        val publisherId = intent.getIntExtra("publisherId", 0)

        // Pasar y recuperar información de un objeto
        Log.i("PublisherActivity", "El Id es ${publisherId.toString()}")
        val publisher = Publisher.publishers.firstOrNull { it.id == publisherId }
        Log.i("El Publisher", publisher.toString())

        // Cargar la vista
        heroeRecyclerView = findViewById(R.id.heroe_recyclerView)

        // Preferencias de login
        val sharedPreferences = getSharedPreferences("mypref", MODE_PRIVATE)
        logoutBtn = findViewById(R.id.logoutBtn)

        // Conectar el adaptador
        heroeRecyclerView.adapter = HeroeAdapter(Heroe.heroes)
        // Definir como queremos que se muestre
        heroeRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)


        // Salir del inicio de sesión
        logoutBtn.setOnClickListener {
            val editor = sharedPreferences.edit()
            editor.remove("isLogged")
            editor.apply()

            val intent = Intent(this@HeroesActivity, PublisherActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}