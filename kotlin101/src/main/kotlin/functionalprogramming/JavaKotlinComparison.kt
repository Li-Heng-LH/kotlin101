package functionalprogramming

fun main() {

    //count certain condition
    println(
        MyCollection.myList
            .count { it.length > 5 }
    ) // 3

    println(
        MyCollection.myList
            .firstOrNull { it.length == 2 }
    ) // is

    println(
        MyCollection.myList
            .groupBy { it.length }
    ) // Map {Int : List<String>}

    println(
        MyCollection.myList
            .associateBy { it.length }
    ) // {10=comparison, 7=between, 4=java, 3=fun, 6=kotlin, 2=is}


    // in Kotlin, there is Function Type,
    // a lambda can be stored in a variable.
    val isEven: (Int) -> Boolean = { it % 2 == 0 }
    println(isEven(2)) // true
    val filtered = listOf(1, 2, 3, 4).filter(isEven)
    println("Filtered: $filtered")
}