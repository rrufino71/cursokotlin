package com.example.cursoaristidevs

fun main() {

    //getMonth(5)
    //getTrimester(5)
    //getSemester(10)
    //result(10)
    println(getSemester(8))
}

fun result(value:Any) {
    when(value) {
        is Int -> println(value + value)
        is String -> println(value)
        is Boolean -> if(value) println("Verdadero")


    }
}

fun getSemester(month: Int):String {
    val result = when (month) {
        in 1..6 -> "Primer Semestre"
        in 7..12 -> "Segundo Semestre"
        !in 1..12 -> "Semestre no valido"
        else ->"Semestre no valido"
    }
    return result

}


fun getTrimester(month: Int) {
    when (month) {
        1, 2, 3 -> println("Primer Trimestre")
        4, 5, 6 -> println("Segundo Trimestre")
        7, 8, 9 -> println("Tercer Trimestre")
        10, 11, 12 -> println("Cuarto Trimestre")
        else -> println("Trimestre no valido")
    }

}


fun getMonth(month: Int) {
    when (month) {
        1 -> println("Enero")
        2 -> println("Febrero")
        3 -> println("Marzo")
        4 -> println("Abril")
        5 -> println("Mayo")
        6 -> println("Junio")
        7 -> println("Julio")
        8 -> {
            println("Agosto")
            println("Mi cumple")
        }
        9 -> println("Septiembre")
        10 -> println("Octubre")
        11 -> println("Noviembre")
        12 -> println("Diciembre")
        else -> println("Mes no valido")

    }
}
