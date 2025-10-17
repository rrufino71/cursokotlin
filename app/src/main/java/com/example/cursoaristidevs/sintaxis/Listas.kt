package com.example.cursoaristidevs

fun main() {
    mutableList()
}

fun mutableList() {
    var weekDays:MutableList<String> = mutableListOf("Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo")
    // weekDays.add("Ruben") agrega al final
    weekDays.add(3 ,"Ruben") //agrega en una posicion
    if(weekDays.isEmpty()) {
        println("Lista vacia")
    }else{
        println(weekDays)
    }
}

fun inmutableList() {
    val readOnly:List<String> = listOf("Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo")
    //println(readOnly.size)
    //println(readOnly)
    //println(readOnly[0])
    //println(readOnly.first())
    //println(readOnly.last())
    val excample = readOnly.filter { it.contains("a") }
    //println(excample)

    readOnly.forEach {weekday -> println(weekday)}

}