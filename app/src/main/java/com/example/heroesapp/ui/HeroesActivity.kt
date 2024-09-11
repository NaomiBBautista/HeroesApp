package com.example.heroesapp.ui

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.heroesapp.MainActivity
import com.example.heroesapp.R

class HeroesActivity : AppCompatActivity() {
    lateinit var logoutBtn : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_heroes)

        val sharedPreferences = getSharedPreferences("mypref", MODE_PRIVATE)
        logoutBtn = findViewById(R.id.logoutBtn)

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