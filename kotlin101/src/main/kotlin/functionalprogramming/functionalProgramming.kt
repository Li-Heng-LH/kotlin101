package functionalprogramming

fun main() {

    val increment: (Int) -> Int = { i -> i + 1 }
    val increment2 = { i: Int -> i + 1 }
    val increment3: (Int) -> Int = { it + 1 }

    println(increment(1)) // 2
    println(increment2(1)) // 2
    println(increment3(1)) // 2

    // lambda with 2 arguments
    // parentheses in function type
    // no parentheses in lambda arguments
    val sum: (Int, Int) -> Int = { a, b -> a + b }
    val sum2 = { a: Int, b: Int -> a + b }

    println(sum(1, 2)) // 3
    println(sum2(1, 2)) // 3
}