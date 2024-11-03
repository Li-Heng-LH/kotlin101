package functionalprogramming

import Person

fun main() {
    val people = listOf(
        Person(name = "A", age = 1),
        Person(name = "B", age = 2),
        Person(name = "C", age = 3),
    )

    println(people.maxBy { it.age })
    //Same as Java, compiler can convert the above lambda to a member reference
    //below shows Member reference:
    println(people.maxBy(Person::age))


    // We can store lambda's in variables
    // and this is a Function type
    val isEven_Lambda: (Int) -> Boolean = { i -> i % 2 == 0 }
    // However, we can't store a function in a variable
    fun isEven_Fun(i: Int) = i % 2 == 0
    //val isEven_Fun2 = isEven_Fun  //Compiler error

}