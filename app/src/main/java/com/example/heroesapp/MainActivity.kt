package com.example.heroesapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.heroesapp.models.User
import com.example.heroesapp.ui.PublisherActivity

class MainActivity : AppCompatActivity() {
    lateinit var  loginBtn : Button
    lateinit var var_email : EditText
    lateinit var var_password : EditText

    // Activity creado y planchado
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        // Traer los componentes creados en el activity_main
        setContentView(R.layout.activity_main)

        // Verificar si el usuario ya esta logeado para navegar al home
        val sharedPreferences = getSharedPreferences("mypref", MODE_PRIVATE)
        val isLogged = sharedPreferences.getBoolean("isLogged", false)

        // Intent implicitos: tu no sabes exactamente a que pantalla vas a llegar (E: Correos)
        // Intent explicitos: tu defines la activity a la cual se navega
        val intent = Intent(this@MainActivity, PublisherActivity::class.java)
        if(isLogged){
            startActivity(intent)
            finish()
        }

        // Traer las variables desde el Activity en base al ID
        loginBtn = findViewById(R.id.loginBtn)
        var_email = findViewById(R.id.emailET)
        var_password = findViewById(R.id.passwordET)

        // Proceso de login
        loginBtn.setOnClickListener {
            Log.i("LOGAPP", "Iniciar sesión")
            val email = var_email.text.toString()
            val password = var_password.text.toString()
            Log.i("EMAIL", email)
            Log.i("PASSWORD", password)

            // Verificar que no haya vacios
            if(email.isEmpty() || password.isEmpty()) {
                Log.i("ERROR", "La contraseña o el correo electronico estan vacios")
                return@setOnClickListener
            }

            // Verificar que el correo y contraseña coincidan con los almecenados
            val isValidUser = User.staticUsers.any{
                user-> user.email == email && user.password == password
            }
            if(!isValidUser){
                Log.i("ERROR", "El correo o la contraseña no son validos")
                return@setOnClickListener
            }

            // Traer datos del usuario verificando que no sea nulo
            val user = User.staticUsers.firstOrNull {
                it.email == email && it.password == password
            }


            // Guardar el logueo
            val editor = sharedPreferences.edit()
            editor.putBoolean("isLogged", true)
            editor.apply()

            // Traer el Usuario por su email
            intent.putExtra("userEmail",user?.email)

            // Navegación a nueva ventana
            startActivity(intent)
            finish()
        }

    }
}