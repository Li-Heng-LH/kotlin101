package extensions

import java.lang.StringBuilder

fun main() {
    println("hello".lastChar()) //instance method in Kotlin
    print("hey".repeat(3))
    println()
    standardCollections()
}

fun String.lastChar() = this.get(this.length - 1) //static method in Java

fun String.lastChar2() = get(length - 1)

fun String.lastChar3() = this[this.length - 1]

fun String.repeat(n: Int) : String {
    val sb = StringBuilder(n * length)
    for (i in 1..n) sb.append(this)
    return sb.toString()
}

fun standardCollections() {
    //under the hood, kotlin standard collections use java standard collections
    println(hashSetOf("").javaClass)        //HashSet
    println(arrayListOf("").javaClass)      //ArrayList
    println(hashMapOf("" to "").javaClass)  //HashMap
}


