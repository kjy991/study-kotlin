package org.example

const val ONE =1
const val TWO =2

fun sum2(num1: Int, num2: Int): Int =num1 + num2

fun getMyName(
    firstName:String = "null-firstName",
    lastName:String = "null-lastName",
):String = "$firstName $lastName"

fun main(args: Array<String>) {

    println(getMyName(firstName = "kim", lastName = "junyeop"))
    println(getMyName())
    println(getMyName(firstName = "kkk"))
    println(getMyName(lastName = "kkk"))

    println(sum2(ONE,TWO))
}


