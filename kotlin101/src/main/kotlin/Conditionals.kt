
fun main() {
    println(getDescription(Color.BLUE))
    println(checkInput(""))
    println(checkInput("y"))
    println(returnPair(16))
}

enum class Color {
    BLUE,
    ORANGE,
    RED,
}

//Single-expression function
fun getDescription(color: Color) =
    when (color) {
        Color.BLUE -> "cold"
        Color.ORANGE -> "mild"
        Color.RED -> "hot"
    }

fun checkInput(input: String) =
    when (input) {
        "y", "yes" -> "glad to hear that"
        "n", "no" -> "sorry to hear that"
        else -> "not clear"
    }

fun mix(c1: Color,
        c2: Color,) =
    when(setOf(c1, c2)) {
        setOf(Color.RED, Color.RED) -> "red"
        setOf(Color.BLUE, Color.BLUE) -> "blue"
        else -> "not sure"
    }

fun returnPair(degrees: Int) =
    //when can have no argument.
    //in that case cases have to be boolean expression
    when {
        degrees < 5 -> Color.BLUE to "cold"
        degrees < 23 -> Color.ORANGE to "mild"
        else -> Color.RED to "hot"
    }

fun returnPair2(degrees: Int) =
    when (degrees) {
        // cases have same type as argument
        5 -> "yes"
        else -> "no"
    }

