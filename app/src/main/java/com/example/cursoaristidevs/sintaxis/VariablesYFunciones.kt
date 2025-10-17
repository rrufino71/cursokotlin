package com.example.cursoaristidevs


val age: Int = 54  //publica

fun main() {

    shownMyName("Ruben")
    shownMyAge(54)
    add(54, 71)
    val mySubtract= subtract(120,20)
    println(mySubtract)
    val mySubtract2= subtractCool(120,20)
    println("SubtractCool $mySubtract2")


}


fun shownMyName(name:String) {
    println("Me llamo $name")
}

fun shownMyAge(currentAge: Int = 50) {
    println("Tengo $currentAge años")
}

fun add(firstNumber: Int, secondNumber: Int) {
    println(firstNumber + secondNumber)
}

fun subtract(firstNumber: Int, secondNumber: Int):Int {
    return firstNumber - secondNumber
}

fun subtractCool(firstNumber: Int, secondNumber: Int):Int = firstNumber - secondNumber


fun variablesBoolen() {
    //Boolean
    val booleanExample = true
    val booleanExample2 = false

}

fun variablesNumericas() {
    /**
     *  variables Numericas solo se ven en el scope de la funcion
     *  val no puede cambiarse el valor es constante
     *  var es variable se puede reasignar valores
     */


    //Int -2,147,483,647 a 2,147,483,647

    var age2: Int = age + 50

    //Long -9,223,372,036,854,775,807 a -9,223,372,036,854,775,807
    val example: Long = 30

    //Float hasta 2 decimales
    val floatExample: Float = 30.5f


    //Double 14 hasta decimales
    val doubleExample: Double = 3241.3123123

    println("Listo age $age")


    println(message = "Sumar: ${age + 10}")
    println(message = "Modulo: ${age % 10}")
    println(floatExample.toInt())


}

fun variablesAlfa() {
    /**
     *  variables Alfanumericas
     */
    var stringConcatenada: String = "Hola"
    //Char entre comillas simples
    val charExample: Char = 'e'

    //String entre comillas dobles
    val stringExample: String = "CleverFox"
    val stringExample2: String = "4"
    val stringExample3: String = "23"
    println(stringExample2.toInt() + stringExample3.toInt())

    stringConcatenada = "Hola me llamo $stringExample y tengo $age años"
    println(stringConcatenada)
    val example123: String = age.toString()
    stringConcatenada = "Hola me llamo $stringExample y tengo $example123 años"


}