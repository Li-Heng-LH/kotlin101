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

}

data class Person(
    val name: String,
    val age: Int,
)