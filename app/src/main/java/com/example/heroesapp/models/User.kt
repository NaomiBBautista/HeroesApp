package com.example.heroesapp.models

data class User(val email : String, val password : String, val name: String){
    //val users = listOf(User(email="naomi@gmail.com", password="hamburguesa"))

    companion object {
        val staticUsers = listOf(
            User(email = "naomi@gmail.com", password = "12345", "Naomi"),
            User(email = "alex@gmail.com", password = "12345", "Alex"),
            User(email = "javier@gmail.com", password = "12345", "Javier")
        )
    }
}
