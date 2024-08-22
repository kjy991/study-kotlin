package org.example

fun main(args: Array<String>) {
    val sum = sum(1, 3)
    val number: Int = 15
    println("sum : $sum")
    println("Hello World!")


    println("Hello World! ${if (number > 10) number else "number is null"}")
    println("sum World! ${sum(3,5)}")
}

fun sum(a: Int, b: Int): Int = a + b
