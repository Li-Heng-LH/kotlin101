
fun main() {
    println(getDescription(Color.BLUE))
    println(checkInput(""))
    println(checkInput("y"))
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


