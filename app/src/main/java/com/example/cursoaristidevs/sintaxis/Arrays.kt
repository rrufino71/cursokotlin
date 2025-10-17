package com.example.cursoaristidevs

fun main() {

    //Tamaños
    val weekDays = arrayOf("Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo")

    println(weekDays.size)
    if (weekDays.size <= 7) {
      //  println(weekDays[3])
    } else {
      //  println("No hay mas valores en el array")
    }

    //Modificar
    weekDays[0] = "Alberto"
    //println(weekDays[0])

    //Recorrer arrays
    for (position in weekDays.indices) {
        //println(weekDays[position])
    }

    for ((position,value) in weekDays.withIndex()) {
        //println("la posicion $position contiene $value")
    }

    for (weekDay in weekDays) {
        println(weekDay)
    }

}


