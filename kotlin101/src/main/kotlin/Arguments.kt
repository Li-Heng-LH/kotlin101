fun main () {
    println(listOf('a', 'b', 'c').joinToString(
        separator = "", prefix = "(", postfix = ")")
    )

    displaySeparator() //**********
    println()
    displaySeparator(size = 2) //**
    println()
    displaySeparator('#', 2) //##
    println()
    displaySeparator(size = 2, character = '#') //##
}

fun displaySeparator(character: Char = '*',
                     size: Int = 10, ) {
    repeat(size) {
        print(character)
    }
}