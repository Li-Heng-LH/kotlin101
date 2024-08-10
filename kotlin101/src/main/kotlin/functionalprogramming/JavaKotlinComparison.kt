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
}