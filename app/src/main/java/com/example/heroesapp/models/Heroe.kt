package com.example.heroesapp.models

data class Heroe(val id: Int, val publisherId : Int, val name:String,val image:String){
    companion object{
        val heroes = mutableListOf<Heroe>(
            // Heroes de Marvel
            Heroe(1, 1, "Iron-Man", "https://i.pinimg.com/736x/d1/49/96/d1499689e2b18f1b895368c5b5dee8e2.jpg"),
            Heroe(2, 1, "Spiderman", "https://i.pinimg.com/736x/01/3f/af/013faf3180fe9deb3a61391e49f8c394.jpg"),
            Heroe(3, 1,"Spider-Woman","https://i.pinimg.com/736x/d2/94/80/d2948046d629aaf74767139902d39dd4.jpg"),
            Heroe(4, 1, "Capitán América", "https://i.pinimg.com/736x/d9/33/2b/d9332bc530ee6ad391992df190fa9b2b.jpg"),
            Heroe(5, 1, "DeadPool", "https://i.pinimg.com/736x/ce/ef/94/ceef9458d1fc37f91a20a477d3866a28.jpg"),
            Heroe(6, 1, "Thor", "https://i.pinimg.com/564x/44/52/99/445299cfa084308816381b48a52707b2.jpg"),
            Heroe(7, 1, "Wolverine", "https://i.pinimg.com/236x/4a/78/c1/4a78c19253666cb9e6989b17ac565d60.jpg"),
            Heroe(8, 1, "Hulk", "https://i.pinimg.com/564x/83/95/33/8395338a8d2da5190fd396c19f01d171.jpg"),
            Heroe(9, 1, "Black Widow", "https://i.pinimg.com/564x/86/5f/2b/865f2b7c9a4bbb57cf227c37f9aafbc8.jpg"),
            Heroe(10, 1, "Loki", "https://i.pinimg.com/564x/53/d4/ad/53d4ada41bcc6321024d90b74f1d2fc7.jpg"),
            Heroe(11, 1, "Vision", "https://i.pinimg.com/564x/7a/62/14/7a62147472fab69daf4ab0785e5341a7.jpg"),
            Heroe(12, 1, "Ant-Man", "https://i.pinimg.com/564x/e1/25/aa/e125aa7764d5aea085a3b9491491e6be.jpg"),
            Heroe(13, 1, "Hawkeye", "https://i.pinimg.com/564x/22/ff/a7/22ffa757c73270e3bb655e9da68a2b78.jpg"),
            Heroe(14, 1,"Doctor Strange", "https://i.pinimg.com/564x/51/2f/87/512f878fb30e64766a68017be59c1891.jpg"),
            Heroe(15, 1, "Brija Escarlata","https://i.pinimg.com/564x/c5/0a/7f/c50a7f768322877c17fbd8e69f065110.jpg"),
            Heroe(16, 1, "Gamora", "https://i.pinimg.com/564x/21/57/e1/2157e1e9fe0abab66390dd86fe83d485.jpg"),
            Heroe(17, 1, "Falcon", "https://i.pinimg.com/564x/0a/52/8e/0a528e8ffa6118a3a3bb40f496a6aaa1.jpg"),
            Heroe(18, 1, "Start-Load","https://i.pinimg.com/564x/c7/f3/33/c7f333c762561ed72eebbe01349bd1cc.jpg"),


            // Heroes DC

            Heroe(19, 2, "Joker", "https://i.pinimg.com/564x/21/71/8a/21718a9ab240a1d4efa6e84038d9a40d.jpg"),
            Heroe(20, 2, "Batgirl", "https://i.pinimg.com/564x/74/bb/93/74bb933da051ee83f288b1693fa74604.jpg"),
            Heroe(21, 2, "Batman", "https://i.pinimg.com/564x/8c/6a/99/8c6a99865f3cffda95913222fc935c56.jpg"),
            Heroe(22, 2, "Superman", "https://i.pinimg.com/564x/26/26/ab/2626abc861cd396adf95ea61ebfd972c.jpg"),
            Heroe(23, 2, "Flash", "https://i.pinimg.com/564x/9c/f2/c4/9cf2c4780ffe34c248a5c537eec31e42.jpg"),
            Heroe(24, 2, "Cybog", "https://i.pinimg.com/564x/26/86/fc/2686fc0c7abc26ee0859ce2e11d80ea6.jpg"),
            Heroe(25, 2, "Wonder-Woman", "https://i.pinimg.com/564x/ab/dd/81/abdd8194fd43f96b4920037d786337dc.jpg"),
            Heroe(26, 2, "Aquaman", "https://i.pinimg.com/564x/62/55/63/625563cbab2a6b0ac685773957dbd9c1.jpg"),
            Heroe(27, 2, "Arrow", "https://i.pinimg.com/564x/6a/cd/e1/6acde1e74634df055a82d04f0f3b47d3.jpg"),
            Heroe(28, 2, "Robin", "https://i.pinimg.com/564x/12/54/bb/1254bbba2d06069299613258ad06e774.jpg"),
            Heroe(29, 2, "Linterna Verde", "https://i.pinimg.com/564x/21/57/e1/2157e1e9fe0abab66390dd86fe83d485.jpg"),
            Heroe(30, 2, "Shazam", "https://i.pinimg.com/236x/75/a7/08/75a708bda3b4e6fd01a1d72d1d3e2d0b.jpg"),
            Heroe(31, 2, "Hawkgirl", "https://i.pinimg.com/564x/2b/6d/aa/2b6daa2e6bd4c26ce8952b1c3c311250.jpg"),
            Heroe(32, 2, "Nightwing", "https://i.pinimg.com/564x/da/c3/44/dac344df4ee571a1805373f05ae47b29.jpg"),
            Heroe(33, 2, "Cat-Woman", "https://i.pinimg.com/736x/cb/aa/85/cbaa85d9cdea1c2828cdaeef40703c08.jpg"),
            Heroe(34, 2, " Martian Manhunter", "https://i.pinimg.com/564x/d6/ee/40/d6ee4038857664afab3902b8782a0f7b.jpg"),
        )
    }
}