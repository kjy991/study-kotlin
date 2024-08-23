package org.example

val String.lastChar: Char
    get() = get(length - 1)

fun String.double(): String = "$this $this"

infix fun String.add(postfix: String) = this + postfix


fun main(args: Array<String>) {
    println("do".double())

    println("1234".lastChar)

    println("this is very " add "good")

    println("this is very ".add("good"))

    println(setOf(1, 2, 3, 41231, 123).maxOrNull())


    mapOf(
        "key" to "value",
        "key2" to "value2",
        "key3" to "value3",
    ).forEach { (key, value) ->
        println("${key} : $value ")

    }

    val (firstName, lastName) = Pair("snow", "man")


}
