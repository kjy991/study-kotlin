package org.example

import java.io.IOException

fun main(args: Array<String>) {
    println(parse("1234"))
}

fun parse(numberStr: String): Int = try {
    Integer.parseInt(numberStr)
} catch (e: Exception) {
    throw IllegalArgumentException(e.message)
} finally {
    println("finally")
}
