# kotlin101
[Cheat Sheet](./CheatSheet.md)

## Some Learning Notes ##

### Assignment
* Before accessing a variable, 
* it must have been given a value.

&nbsp;

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
* `until` infix function: upper bound exclusive

&nbsp;

### Range and Progression
* `in` has 2 purposes:
  1. for iteration over Progression
  2. to check for belonging with Range
* Progressions: 
  * IntProgression,
  * LongProgression,
  * CharProgression.

&nbsp;

### Pair
* `to` infix function is used to create a Pair

&nbsp;

### Exceptions
* There is no concept of checked or unchecked exceptions in Kotlin.
* `throw` is an expression.
* `try` is an expression.
* `@Throws` annotation tells JVM to handle checked exception

### Extensions
* To declare an extension function, prefix its name with a receiver type,  
  which refers to the type being extended.
* instance method in Kotlin
* static method in Java
* Cannot call private members from extensions. 
* Kotlin standard library is just = Java standard library + extensions
  * under the hood, kotlin standard collections use java standard collections
  * benefits: 
  * small runtime jar
  * easy java interop

&nbsp;

### infix functions
* can omit dot and parentheses
* `1.until(10)` --> `1 until 10`   
* In `Tuples.kt`, 
  * `public infix fun <A, B> A.to(that: B): Pair<A, B> = Pair(this, that)`

&nbsp;

### Multiline strings
* using triple quote `"""`
* contains no escaping and can contain newlines and any other characters

&nbsp;

### Nullability
* safe call operator: `?.`
* 

&nbsp;

&nbsp;
----
### Useful links ###
* []()