package org.example


fun main(args: Array<String>) {
//    val strings = listOf("abc", "def")
//    println(strings.map { it.toList() })
//    println(strings.map { it.toList() }.flatten())
//    println(strings.flatMap { it.toList() })

    println("=========================")
    val result: List<List<Char>> = persons
        .map { it.name }
        .map { it.toList() }

    val result2: List<Char> = persons
        .map { it.name }
        .flatMap { it.toList() }

    val result3: String? = persons.asSequence()
        .map { it.name }
        .find { it.startsWith("a") }



    println("result : $result")
    println("result2 : $result2")
    println("result3 : $result3")

    println("=========================")

    println(
        persons.asSequence()
            .map {
                println(it)
                it.name
            }.find { it.startsWith("a") }

    )
    println("=========================")

    println(
        persons.groupBy { it.age }
    )
}






















