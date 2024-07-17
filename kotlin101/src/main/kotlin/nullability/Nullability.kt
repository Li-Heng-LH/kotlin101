package nullability

fun main() {
    val s: String?
    s = null
    println(s) //null

    //safe call operator
    val length: Int? = s?.length

    //above is equivalent to
    val length2: Int? = if (s != null) s.length else null

}