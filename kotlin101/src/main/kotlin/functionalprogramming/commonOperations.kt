package functionalprogramming

fun main () {
    println(
        listOf(1, 2, 3, 4, 5)
            .filter { it > 3 } // [4, 5]
    )

    println(
        listOf(1, 2, 3, 4, 5)
            .map { it * it } // [1, 4, 9, 16, 25]
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

//    val test2 = listOf(1, 2, 3, 4, 5).first { it > 100 } // Throws NoSuchElementException

    println(
        listOf(1, 2, 3, 4, 5)
            .firstOrNull { it > 5 } // null
    )

    println(
        listOf(1, 2, 3, 4, 5)
            .count() // 5
    )

    println(
        listOf(1, 2, 3, 4, 5)
            .count { it > 4 } // 1
    )

    val (match, rest) = listOf(1, 2, 3, 4, 5)
        .partition { it > 3 }
    println(match) // [4, 5]
    println(rest) // [1, 2, 3]

    println(
        listOf(1, 2, 3, 4, 5)
            .groupBy { it % 2 == 0 } // {false=[1, 3, 5], true=[2, 4]}
    )

    println(
        listOf("one", "two", "three", "four")
            .groupBy { it.length } // {3=[one, two], 5=[three], 4=[four]}
    )

    // associateBy is useful when
    // the key is unique, and
    // you do not want to have list as the value
    println(
        listOf("one", "two", "three", "four")
            .associateBy { it.length } // {3=two, 5=three, 4=four}
    )

    println(
        listOf("one", "two", "three", "four")
            .associateWith { it.length } // {one=3, two=3, three=5, four=4}
    )

    println(
        listOf("one", "two", "three", "four")
            .associate { "$it!" to it.length } // {one!=3, two!=3, three!=5, four!=4}
    )

    val numberSets = listOf(setOf(1, 2, 3), setOf(4, 5, 6), setOf(1, 2))
    println(numberSets.flatten()) // [1, 2, 3, 4, 5, 6, 1, 2]

    // only flatten one level
    val numbers2 = listOf(setOf(1, 2, 3), setOf(setOf(4, 5, 6), 5, 6), listOf(1, 2))
    println(numbers2.flatten()) // [1, 2, 3, [4, 5, 6], 5, 6, 1, 2]

    // flatMap is a combination of map and flatten
    // map first, then flatten
    println(numberSets.flatMap { it }) // [1, 2, 3, 4, 5, 6, 1, 2]
}