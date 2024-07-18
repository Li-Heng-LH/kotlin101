package nullability

fun main() {

    //assignments and access
    //cannot assign null to a non-nullable type
    //val s: String = null //compilation error

    //cannot access a nullable type without a null check
    val s: String? = null
    //s.length //compilation error

    safeCallOperator()
    elvisOperator()
    smartCast()
    notNullAssertion()
    safeCast()
    castingNull()
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

    //control flow analysis
    println(s.length) //no need to use safe call operator, smart cast after the null check
}

fun notNullAssertion() {
    val s: String? = "good"
    s!! //throws NPE if s is null

    //control flow analysis
    println(s.length) //no need to use safe call operator after the not-null assertion
}

fun String?.isEmptyOrNull() = this == null || this.isEmpty()

fun safeCast() {

    val s = "hello"
    if (s is String) {
        println(s.uppercase()) //smart cast
    }

    //safe type cast
    val s2 : String? = s as? String
    println(s2?.uppercase()) //HELLO

    //above is equivalent to
    val s3 : String? = if (s is String) s else null
}

fun castingNull() {
    //println(null as String) //NPE, null cannot be cast to non-null type
    println( null as String? ) //null
    println( null as? String ) //null, failed cast
    println( null as? String? ) //null, successful cast
}