package functionalprogramming

fun main () {
    println(
        listOf(1, 2, 3, 4, 5)
            .filter { it > 3 }
    )

    println(
        listOf(1, 2, 3, 4, 5)
            .map { it * it }
    )

    println(
        listOf(1, 2, 3, 4, 5)
            .any { it > 3 } // true
    )

    println(
        listOf(1, 2, 3, 4, 5)
            .any { it > 10 } // false
    )

    println(
        listOf(1, 2, 3, 4, 5)
            .none { it > 10 } // true
    )

    println(
        listOf(1, 2, 3, 4, 5)
            .all { it > 0 } // true
    )

    val test: Int? =
        listOf(1, 2, 3, 4, 5)
            .find { it > 4 }  //Returns the first element matching the given predicate
    println(test)
}