package org.example

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


fun main(args: Array<String>) {
    val person = Person("yk", 34, false)
    println("person = $person")

    val square = Rectangle(10, 10)
    println(square.isSquare)


    val persons = listOf(
        Person("a", 1, true),
        Person("b", 2, true),
        Person("c", 3, true),
        Person("d", 4, true),
        Person("e", 5, true),
        Person("f", 6, true),
    )

    println(persons.maxOfOrNull({ person: Person -> person.age }))
    println(persons.maxByOrNull ({ person: Person -> person.age }))
    println(persons.minByOrNull { it.age })

}

