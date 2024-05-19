import java.lang.NumberFormatException

fun main() {
    testTry()
}

fun testThrow() {
    var number = -1
    val percentage = if (number in 0..100) number
    else throw IllegalStateException("Not a valid percentage")
    // throw is an expression
}

fun testTry() {
    val number = try {
        Integer.parseInt("")
    } catch (e: NumberFormatException) {
        //return // return from outer fun, or
        null
    }
    println(number)
}

