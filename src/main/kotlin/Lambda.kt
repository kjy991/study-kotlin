fun sum2(x: Int, y: Int): Int = x + y
val sumLambda = { x: Int, y: Int -> x + y }

fun main() {
    val sumLambda2 = { x: Int, y: Int -> x + y }


    println("sum2 : ${sum2(1, 3)}")
    println("sumLambda2 : ${sumLambda2(1, 3)}")
    println("sumLambda : ${sumLambda(1, 3)}")
    println("{ x: Int, y: Int -> x + y } :  ${{ x: Int, y: Int -> x + y }(1, 4)}")


}