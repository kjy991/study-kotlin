object NumberUtils {
    fun sum(a: Int, b: Int): Int {
        return a + b
    }

    fun multiply(a: Int, b: Int): Int {
        return a * b
    }
}

open class Parent(
    private val familyName: String
)

data class Child(
    val subName: String,
    val familyName: String = "",
    val age: Int
) {
    companion object {
        const val MAX_CHILDREN_COUNT = 4
        fun ofDefaultAge(
            subName: String,
            familyName: String,
        ): Child = Child(subName, familyName, age = 0)
    }
}

fun main() {
    println(NumberUtils.sum(1, 2))
    println(NumberUtils.multiply(2, 2))

    val ofDefaultAge = Child.ofDefaultAge("sub", "family")
    println(ofDefaultAge.age)
    println(ofDefaultAge)


}