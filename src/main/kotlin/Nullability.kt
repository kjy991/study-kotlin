import org.example.Person

fun main() {
    val nullablePerson: Person? =
        if (System.currentTimeMillis() % 2 == 0L) Person("yeopking", 34, true)
        else null

    val notNullPerson: Person = nullablePerson ?: Person(
        "default person", 0, false
    )

    if (nullablePerson != null) {
        println("nullablePerson!!.age : ${nullablePerson!!.age}")
    } else println("nullablePerson?.age:  ${nullablePerson?.age ?: 0}")


    println(notNullPerson)
}