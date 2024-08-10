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
}