package functionalprogramming

fun main() {
    println(duplicateNonZero(listOf(3, 0, 5,)))
    println(duplicateNonZero_implicit_return(listOf(3, 0, 5,)))
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
