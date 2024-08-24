package org.example

import Child

data class Person(
    val name: String,
    val age: Int,
    val isMarried: Boolean
)

class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() = height == width

//    fun isSquare(): Boolean = height == width
}


val persons = listOf(
    Person("a", 1, true),
    Person("b", 2, true),
    Person("c", 3, true),
    Person("d", 4, true),
    Person("e", 5, true),
    Person("f", 6, true),
)

fun main(args: Array<String>) {
    val person = Person("yk", 34, false)
    println("person = $person")

    val square = Rectangle(10, 10)
    println(square.isSquare)

    println(persons.maxOfOrNull({ person: Person -> person.age }))
    println(persons.maxByOrNull({ person: Person -> person.age }))
    println(persons.minByOrNull { it.age })

    println("===============================")
    println(persons
        .filter { it.age > 3 }
        .map { "${it.name}'s age is ${it.age} \n" }
    )

    println(persons
        .filter { it.age > 3 }
        .map { Child.ofDefaultAge(it.name, "no family") }
//        .find { it.subName == "f" }
        .count { it.age == 0 }
//        .any { it.age < 1 }
    )
}






















