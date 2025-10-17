package com.example.cursoaristidevs

fun main() {
    var name:String? = "Ruben"  //variable de tipo string nullable

    //println(name!![0])  //!! esto le dice que voy a estar seguro que no va a ser null
    println(name?.get(3) ?:"es nulo wey" )  //? significa si no es  ?: operador elvis
}
