package me.liheng

data class MyData(
    val name: String?,
)

fun main() {
    val dt = MyData(null) //need to explicitly pass in null
    println(dt)
}