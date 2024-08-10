package functionalprogramming

data class Hero(
    val name: String,
    val age: Int,
)

fun main() {
    val heroes = listOf(
        Hero("The Captain", 60),
        Hero("Frenchy", 42),
        Hero("The Kid", 9),
        Hero("Lady Lauren", 29),
        Hero("First Mate", 29),
        Hero("Sir Stephen", 37),
    )

    val mapByAge: Map<Int, List<Hero>> =
        heroes.groupBy { it.age }
    val (age, _) = mapByAge.maxBy { (_, group) ->
        group.size
    }!!
    println(age) //29

    mapOf("A" to 1, "B" to 2)["C"]
}



