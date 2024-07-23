package functionalprogramming

fun main() {

    val increment: (Int) -> Int = { i -> i + 1 }
    val increment2 = { i: Int -> i + 1 }
    val increment3: (Int) -> Int = { it + 1 }

    println(increment(1)) // 2
    println(increment2(1)) // 2
    println(increment3(1)) // 2
}