# kotlin101

## Some Learning Notes ##

### Array ###
* In bytecode level, Kotlin Array is same as Java Array. 
* In Kotlin syntax, Array looks like a regular class with generic arguments.  

&nbsp;

### if ###
* An expression resolves to a value.  

| if in Kotlin | expression | 
|--------------|------------| 
| if in Java   | statement  | 

* Therefore, there is no ternary operator (condition ? then : else)

&nbsp;

### val ###
* val is like final in Java
* val cannot be reassigned
* Kotlin is statically typed. 
* Compiler can infer the type. 

&nbsp;

### Function Structure ###
* `return void` --> `: Unit`
* `println` a fun that returns Unit --> Unit will be printed.  

* General function structure:   

```kotlin
fun functionName(parameter1: Type1, parameter2: Type2, ...): ReturnType {}
```

* Each parameter must be **explicitly** typed.
* Trailing commas can be used when declaring function parameters. 
* Functions with block body must always specify return types **explicitly**,  
  unless it's intended for them to return `Unit`.

&nbsp;

### Top-Level Functions ###
* functions defined outside any class.
* ideal for replacement of Java Utility class static methods. 
* under the hood, implemented as static functions.
* To import the Util methods,  
  * `import package.method`
  * No need to specify file name

&nbsp;

### Single-expression functions ###
```kotlin
fun functionName(parameters: ParameterType): ReturnType = expression
```

* `fun double(x: Int): Int = x * 2`

&nbsp;

### Conditionals
* `if` is an expression
* `when` is an expression
* `when` as switch
  * no need break
  * no need `else` if cases are exhaustive
  * `when` cases have to be exhaustive
* but `when` can do more: 
  * check values
  * expression can be used as branch condition

&nbsp;

### for loop
* `in` to iterate through elements
* `in` to iterate through range
* `..` operator: upper bound inclusive
* `until` operator: upper bound exclusive

&nbsp;

### ranges
* `in` has 2 purposes:
  1. for iteration
  2. to check for belonging

&nbsp;

### Pair
* `to` keyword is used to create a Pair

&nbsp;

### Exceptions
* There is no concept of checked or unchecked exceptions in Kotlin.
* `throw` is an expression.
* `try` is an expression.
* `@Throws` annotation tells JVM to handle checked exception

### Extensions
* instance method in Kotlin
* static method in Java
* Cannot call private members from extensions. 
* Kotlin standard library is just = Java standard library + extensions
  * under the hood, kotlin standard collections use java standard collections
  * benefits: 
  * small runtime jar
  * easy java interop

&nbsp;

## Kotlin over Java:
* top level functions
* single expression functions
* trailing commas
* data class
* `when` no need break, no need default if exhaustive
* powerful `when`
* smart cast
* No checked exceptions in Kotlin. 
* Expressions: 
  * `if` is an expression
  * `throw` is an expression
  * `try` is an expression
* Extensions

&nbsp;

&nbsp;
----
### Useful links ###
* []()