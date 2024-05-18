
fun main() {
    println(getDescription(Color.BLUE))
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