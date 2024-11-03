package functionalprogramming

import java.util.function.BiPredicate
import java.util.function.Predicate

//Lambda expressions are function literals in Kotlin
fun main() {

    //SAM conversions in Kotlin
    val runnable = Runnable { println("Hello") }
    runnable.run()

    val predicate = Predicate<Int> { it > 0 }

    val biPredicate = BiPredicate<Int, Int> { i, i2 -> i == i2 }

    val biPredicate2 = BiPredicate<Int, Int> { i, i2 ->
        println("hello from biPredicate2")
        i == i2
    }
    println(biPredicate2.test(1, 1))

    //qualified return syntax - return to labels
    val sum = sum@{ x: Int, y: Int -> return@sum x + y }
    val sum2 = { x: Int, y: Int -> x + y }

    //() is compulsory for fun type declarations, even when there is only one parameter.
    val isEven: (Int) -> Boolean = { it % 2 == 0 }

    //call lambda directly
    { println("call lambda directly") } ()
    run { println("call lambda directly") }

    //lambda and java SAM
    val postponeRun: (Int, Runnable) -> Unit = { _, _ -> }
    postponeRun(1_0000, runnable) //SAM convention
    postponeRun(1_000) { println("I am lambda") } //lambda

    //nullable function
    val foo: (() -> Unit)? = null
    foo?.invoke() //safe call on nullable fun

    // 2 ways to write lambdas:
    // 1: with type declaration, can use it
    val isEven_type: (Int) -> Boolean = { it % 2 == 0 }
    // 2: without type declaration
    val isEven_no_type = { i: Int -> i % 2 == 0 }
}

fun postponeRun(delay: Int, runnable: Runnable) {}

