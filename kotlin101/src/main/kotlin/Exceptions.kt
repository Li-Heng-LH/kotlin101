import java.io.IOException
import java.lang.NumberFormatException

fun main() {
    testTry()
    error() //note: in Kotlin still no need to handle
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

@Throws(IOException::class)
fun error() {
    throw IOException()
}

