fun main() {

    val myMap = mapOf("A" to 1, "B" to 2)

    //prefer indexed access operator, that is
    //translated to calls of get and set
    println(
        myMap["C"] ?: -1 //-1
    )

    //Destructuring declarations
    val person = Person(name = "A", age = 1)
    val (name, age) = person
    println("$name, $age") //A, 1

    for ((key, value) in myMap) {
        println("$key, $value")
    }

    myMap.forEach { (key, value) -> println("$key, $value") }

    val myPair = "A" to 1
    val (k, v) = myPair
    println("$k, $v")

    //getOrElse only calls the defaultValue function when cannot get
    //lazy evaluation
    //trailing lambda
    println("getOrElse on List: ")
    println(
        listOf(1, 2, 3).getOrElse(100) { it } //100
    )
    println("getOrElse on Map: ")
    println(
        myMap.getOrElse("EFG") { 100 } //100
    )
}

data class Person(
    val name: String,
    val age: Int,
)