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

}

