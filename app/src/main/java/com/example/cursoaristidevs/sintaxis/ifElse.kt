package com.example.cursoaristidevs

fun main() {
    //ifBasico("Aris")
    //ifAnidado()
    //ifBoolean()
    //ifInt()
    //ifMultiple()
    ifMultipleOr()
}

fun ifMultipleOr() {
    var pet = "cat"
    if (pet=="dog" || pet=="cat"){
        println("es un perro o un gato")
    }else{
        println("no es un perro o un gato")
    }
}

fun ifMultiple() {
    var age:Int = 18
    var parentPermission:Boolean = true
    if (age >= 18 && parentPermission) {
        println("puedo beber")
    }else {
        println("no puedo beber")
    }
}

fun ifInt(){
    var age:Int = 29
    if (age > 18) {
        println("Es mayor")
    }else{
        println("Es menor")
    }
}

fun ifBoolean() {
    var soyFeliz:Boolean = false
    if(!soyFeliz) {
        println("Estoy triste :(")
    }
}

fun ifAnidado() {
    val animal = "horse"
    if (animal == "dog") {
        println("es un perro")
    }else if (animal == "cat") {
            println("es un gato")
    }else if(animal=="horse") {
        println("es un caballo")
    }else{
        println("no es un animal")
    }
}

fun ifBasico(name:String = "NN") {
    //val name = "Aris"
    if (name == "Pepe") {
        println("la variable es Aris")
    }else {
        println("la variable no es Aris es $name")
    }
}

