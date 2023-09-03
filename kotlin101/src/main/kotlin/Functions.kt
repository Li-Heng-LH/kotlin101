fun main() {
    println(max(1, 2))
    println("${max(1, 2)}")

    println(max2(2, 3))
}

fun max(a: Int, b: Int): Int {
    return if(a > b) a else b
 }

//Single-expression function
fun max2(a: Int, b: Int) = if(a > b) a else b
