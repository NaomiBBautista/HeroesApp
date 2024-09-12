package com.example.heroesapp.models

class Publisher(val id: Int, val name: String, val image: String) {
    companion object{
        val publishers = mutableListOf<Publisher>(
            Publisher(1,"Universo Marvel","https://cdn.beahero.gg/2019/06/marvel-logo-wallpaper_1-1.jpg"),
            Publisher(2,"Universo DC","https://static.dc.com/2022-06/dc-logo-600x600.jpg")
        )
    }
}