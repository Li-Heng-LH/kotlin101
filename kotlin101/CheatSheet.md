## Kotlin over Java:

* top level functions
* single expression functions
* trailing commas
* data class
* Named arguments when calling functions
* Infix functions
  * `to` used to create a Pair
  * `until` to create Range

* `when` no need break, no need default if exhaustive
* powerful `when`
* Smart Cast and control flow analysis
* No checked exceptions in Kotlin.
* Expressions:
    * `if` is an expression
    * `when` is an expression
    * `throw` is an expression
    * `try` is an expression

* Extensions: prefix fun name with receiver type and dot.

* Natural language to name test methods using backticks

* Multiline strings using triple quote `"""`

* String templates are generally preferred over string concatenation.

* Null Safety: cannot access a nullable type without checking for null
* Nullable has no performance overhead compared to Optional in Java.

* Functional Programming: 
  * Java's functional programming is achieved through functional interfaces. 
  * Kotlin has native support for higher order functions.
  * Functions in Kotlin are first class citizens.
  * Kotlin has function types
  * trailing lambdas
  * common operations are extension functions, no need to convert to 'stream'

&nbsp;

## keyword, operator, infix function
* `in` -> keyword
* `?:` -> operator
* `to` -> infix function

## Keywords
* `as?` -> safe type cast

## operators
* `?.` : Safe call operator
* `?:` : Elvis operator
* `!!` : Not-null assertion operator

## special identifier
* `it`: implicit name for **single** parameter

&nbsp;

## Null Safety
* `String` and `String?` are different types.
* cannot assign null to a non-nullable type
* cannot access a nullable type without checking for null
* Kotlin Nullable != Java Optional
  * in Kotlin, can assign `String` to `String?`,
  * in Java, cannot assign `String` to `Optional<String>`.
&nbsp;


&nbsp;
----
### Useful links ###
* [Coding conventions](https://kotlinlang.org/docs/coding-conventions.html)
* [Keywords and operators](https://kotlinlang.org/docs/keyword-reference.html)
* [Operator precedence](https://kotlinlang.org/docs/reference/grammar.html#expressions)