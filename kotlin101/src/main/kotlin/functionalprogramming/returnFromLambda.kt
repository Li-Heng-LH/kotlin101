package functionalprogramming

fun main() {
    println(duplicateNonZero(listOf(3, 0, 5,)))
    println(duplicateNonZero_implicit_return(listOf(3, 0, 5,)))

    listOf(1, 2, 3, 4).forEach {
        if (it == 3) return@forEach // equivalent to continue in a loop
        print("$it ")
    }
}

fun duplicateNonZero(list: List<Int>) : List<Int> {
    return list.flatMap {
        if (it == 0) return@flatMap listOf()
        listOf(it, it)// the value of the last expression is implicitly returned.
    }
}

fun duplicateNonZero_implicit_return(list: List<Int>) : List<Int> {
    return list.flatMap {
        //if-else is an expression
        if (it == 0) listOf()
        else listOf(it, it)
    }
}
