fun main() {

    // iterating elements
    val list = listOf("a", "b", "c")
    for (element in list) {
        print(element)
    }
    println()

    // iterating map
    val map = mapOf(
        1 to "one",
        2 to "two",
        3 to "three",
    )
    for ((k, v) in map) {
        println("$k = $v")
    }

    //range
    //123456789
    for (i in 1..9) {
        print(i)
    }
    println()

    //12345678
    for (i in 1 until 9) {
        print(i)
    }
    println()

    //97531
    for (i in 9 downTo 1 step 2) {
        print(i)
    }
    println()

    //iterating over string
    //uftu
    for (c in "test") {
        print(c + 1)
    }
    println()
}


