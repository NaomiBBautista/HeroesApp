package com.example.heroesapp.models

data class Heroe(val id: Int,val name:String,val image:String, val publisherId : Int, val fondoUrl : String){
    companion object{
        val heroes = mutableListOf<Heroe>(
            // Heroes de Marvel
            Heroe(1,"Iron-Man","https://i.pinimg.com/736x/d1/49/96/d1499689e2b18f1b895368c5b5dee8e2.jpg", 1, "https://i.pinimg.com/564x/fb/11/05/fb1105f48ce069644f1e3906e3dc308b.jpg"),
            Heroe(2, "Spider-Man", "https://i.pinimg.com/736x/01/3f/af/013faf3180fe9deb3a61391e49f8c394.jpg", 1, "https://i.pinimg.com/564x/c8/f4/fd/c8f4fd5acc5da23922f97f31474b7678.jpg"),
            Heroe(3,"Capitán América","https://i.pinimg.com/736x/d9/33/2b/d9332bc530ee6ad391992df190fa9b2b.jpg", 1, "https://i.pinimg.com/564x/d2/9f/fd/d29ffd227a397099c547c77c7c0a14b8.jpg"),
            Heroe(4, "DeadPool", "https://i.pinimg.com/736x/ce/ef/94/ceef9458d1fc37f91a20a477d3866a28.jpg", 1, "https://i.pinimg.com/564x/c7/f7/c2/c7f7c2d2e8e60a165f58c65127111ecf.jpg"),
            Heroe(5, "Thor", "https://i.pinimg.com/564x/44/52/99/445299cfa084308816381b48a52707b2.jpg", 1, "https://i.pinimg.com/564x/82/aa/ad/82aaadb6f7a234eca7c4f04a5686c8c7.jpg"),
            Heroe(6, "Wolverine", "https://i.pinimg.com/236x/4a/78/c1/4a78c19253666cb9e6989b17ac565d60.jpg", 1, "https://i.pinimg.com/564x/ec/9b/d8/ec9bd8964c5f32ed84d228de0e7f8f3f.jpg"),

            // Heroes DC
            Heroe(7, "Batman", "https://i.pinimg.com/564x/8c/6a/99/8c6a99865f3cffda95913222fc935c56.jpg", 2, "https://i.pinimg.com/564x/0d/9b/d4/0d9bd434b57a4fa0083ac2d861ce987f.jpg"),
            Heroe(8, "Superman", "https://i.pinimg.com/564x/26/26/ab/2626abc861cd396adf95ea61ebfd972c.jpg", 2, "https://i.pinimg.com/564x/3c/7c/5f/3c7c5f1efd179a036309237c00d0e103.jpg"),
            Heroe(9, "Flash", "https://i.pinimg.com/564x/9c/f2/c4/9cf2c4780ffe34c248a5c537eec31e42.jpg", 2, "https://i.pinimg.com/564x/83/76/a1/8376a133a4f397cea93a1d675870af2b.jpg"),
            Heroe(10, "Cybog", "https://i.pinimg.com/564x/26/86/fc/2686fc0c7abc26ee0859ce2e11d80ea6.jpg", 2, "https://i.pinimg.com/564x/a5/7a/40/a57a40d3a5f9e21f730822e9e3d049af.jpg"),
            Heroe(11, "Wonder-Woman", "https://i.pinimg.com/564x/ab/dd/81/abdd8194fd43f96b4920037d786337dc.jpg", 2, "https://i.pinimg.com/564x/43/13/4f/43134f9e633a1b88cfa02b42810851c8.jpg"),
            Heroe(12, "Aquaman", "https://i.pinimg.com/564x/62/55/63/625563cbab2a6b0ac685773957dbd9c1.jpg", 2, "https://i.pinimg.com/564x/7c/85/82/7c85824ba0d9b23b6c283bb935eb1113.jpg")
        )
    }
}