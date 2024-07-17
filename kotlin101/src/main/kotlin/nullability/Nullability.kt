package nullability

fun main() {
    safeCallOperator()
    elvisOperator()
    smartCast()
}

fun safeCallOperator() {
    val s: String?
    s = null
    println(s) //null

    //safe call operator
    val length: Int? = s?.length

    //above is equivalent to
    val length2: Int? = if (s != null) s.length else null
}

fun elvisOperator() {
    val s: String? = null
    val length: Int = s?.length ?: 0
    println(length) //0

    //above is equivalent to
    val length2: Int = if (s != null) s.length else 0
    println(length2) //0

    val b: Int? = 1
    val c = (b ?: 0) + 2
    println(c) //3
}

fun smartCast() {
    val s: String? = "good"
    if (s == null) return
    println(s.length) //no need to use safe call operator, smart cast after the null check
}