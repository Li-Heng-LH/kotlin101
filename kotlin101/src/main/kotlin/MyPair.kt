fun main() {
    tupleLikeCall()
}

fun tupleLikeCall() {
    // tuple-like call side
    // infix function constructor for Pair
    val (a, b) = 1 to "A"
    println(a)
    println(b)
}