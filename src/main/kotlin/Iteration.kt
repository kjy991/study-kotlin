package org.example

fun main(args: Array<String>) {
    val students = mutableMapOf<Any, String>()

    students[1] = "jack"
    students[2] = "yeop_king"
    students[3] = "hy"
    students["key"] = "key_jack"

    println(students[1])
    println(students[2])
    println(students[3])
    println(students["key"])

    for (c in students) {
        println("번호 : ${c.key}  이름 : ${c.value}")
    }
    println("---------------------------")
    for ((key, name) in students) {
        println("번호 : ${key}  이름 : ${name}")
    }

    val st = mapOf(
        1 to "jack",
        2 to "yeop_king",
        3 to "hy"
    )

    for (entry in st) {
        println("entry key : ${entry.key}  key : ${entry.value}")
    }

    println("---------------------------")

    println(recognize('a'))
    println(recognize('3'))
    println(recognize('-'))
}
    fun recognize(c: Char) = when (c) {
        in '0' .. '9' -> "숫자"
        in 'a' .. 'z' , in 'A' .. 'Z' -> "알파벳"
        else -> "숫자도 문자도 아님"

    }
