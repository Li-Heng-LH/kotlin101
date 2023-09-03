fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    //ordinary if
    if (1 < 2) println("1 < 2")
    else println("weird")

    //if as expression
    val foo = if (1 > 2) "a" else 3
    println(foo)
}
