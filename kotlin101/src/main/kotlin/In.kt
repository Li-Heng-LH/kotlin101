fun main() {
    println(isLetter('H'))
    println(isLetter('*'))

    rangeOfStrings()
}

fun isLetter(c: Char) =
    c in 'a'..'z' || c in 'A'..'Z'

fun rangeOfStrings() {
    println("Kotlin" in "Java".."Scala")
    println("Kotlin" in setOf("Java", "Scala"))
}

