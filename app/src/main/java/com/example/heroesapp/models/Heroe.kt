package com.example.heroesapp.models

data class Heroe(val id: Int, val publisherId : Int, val name:String,val image:String){
    companion object{
        val heroes = mutableListOf<Heroe>(
            // Heroes de Marvel
            Heroe(1,
                1,
                "Iron-Man",
                "https://i.pinimg.com/736x/d1/49/96/d1499689e2b18f1b895368c5b5dee8e2.jpg"),

            Heroe(2,
                1,
                "Spider-Man",
                "https://i.pinimg.com/736x/01/3f/af/013faf3180fe9deb3a61391e49f8c394.jpg"),

            Heroe(3,
                1,
                "Capitán América",
                "https://i.pinimg.com/736x/d9/33/2b/d9332bc530ee6ad391992df190fa9b2b.jpg"),

            Heroe(4,
                1,
                "DeadPool",
                "https://i.pinimg.com/736x/ce/ef/94/ceef9458d1fc37f91a20a477d3866a28.jpg"),

            Heroe(5,
                1,
                "Thor",
                "https://i.pinimg.com/564x/44/52/99/445299cfa084308816381b48a52707b2.jpg"),

            Heroe(6,
                1,
                "Wolverine",
                "https://i.pinimg.com/236x/4a/78/c1/4a78c19253666cb9e6989b17ac565d60.jpg"),


            // Heroes DC
            Heroe(7,
                2,
                "Batman",
                "https://i.pinimg.com/564x/8c/6a/99/8c6a99865f3cffda95913222fc935c56.jpg"),

            Heroe(8,
                2,
                "Superman",
                "https://i.pinimg.com/564x/26/26/ab/2626abc861cd396adf95ea61ebfd972c.jpg"),

            Heroe(9,
                2,
                "Flash", "https://i.pinimg.com/564x/9c/f2/c4/9cf2c4780ffe34c248a5c537eec31e42.jpg"),

            Heroe(10,
                2,
                "Cybog", "https://i.pinimg.com/564x/26/86/fc/2686fc0c7abc26ee0859ce2e11d80ea6.jpg"),

            Heroe(11,
                2,
                "Wonder-Woman",
                "https://i.pinimg.com/564x/ab/dd/81/abdd8194fd43f96b4920037d786337dc.jpg"),

            Heroe(12,
                2,
                "Aquaman",
                "https://i.pinimg.com/564x/62/55/63/625563cbab2a6b0ac685773957dbd9c1.jpg"),
        )
    }
}