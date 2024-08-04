# kotlin101
[Cheat Sheet](./CheatSheet.md)

## Some Learning Notes ##

### Assignment
* Before accessing a variable, it must have been given a value.
* cannot assign null to a non-nullable type.

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
* `String` and `String?` are different types.
* cannot assign null to a non-nullable type
* **cannot access a nullable type without checking for null**
* Only (?.) or (!!.) can be used to access a nullable type
* Kotlin compiler is able to perform **control flow analysis** 
  * and **apply smart casts to cast a nullable type to a non-nullable type**, 
  * so that you can access the value without any additional checks.
* Reason for Not-null assertion operator: 
  * by logic of the application, the value cannot be null, 
  * but the compiler cannot infer that, 
  * so we assert that it is not null, 
  * and directly access the value.
* Bad practice of using `!!` operator: 
  * Bad practice to put two or more not-null assertion operators in one line.
  * As you won't to be able to say which one cause the exception. 
* In general prefer using safe operators: Safe access. Elvis separator or explicit checks 
  * Use not null assertion only with care.
* Nullable types under the hood:
  * Under the hood, nullable types are implemented using annotations. 
  * Kotlin compiler simply adds Nullable and NotNullable annotations to the corresponding types usages.
* *Kotlin Nullable != Java Optional*
  * Java Optional type is a wrapper that stores the reference to the initial object. 
  * For each optional value an extra object is created. 
  * At the same time, nullable types don't create any wrappers. 
  * They are implemented by annotations.
  * Compared to Java Optional, this gives no overhead.
  * Also, regarding subtyping, 
    * in Kotlin, can assign `String` to `String?`,
    * in Java, cannot assign `String` to `Optional<String>`.
* Safe cast: 
  * `as?` : `if (s is String) s else null`

&nbsp;

### Functional Programming
* Functions are treated as first-class citizens, meaning they can be passed as arguments, returned from other functions, and assigned to variables. 
* Higher-order functions are functions that take other functions as parameters or return them as results.
* Kotlin has Function types
* **`()` is needed to declare function types**
* **`{}` is needed to instantiate lambda**
* **`{}` for lambdas are bolded in Intellij to distinguish from conditionals**
* `()` is needed for fun type declarations. If `()` shows in fun arguments, it is destructuring declaration. 

* trailing lambda: 
  *  if the last parameter of a function is a function, 
  *  then the lambda can be placed outside the parentheses.
  *  If the lambda is the only argument in that call, 
  *  the parentheses can be omitted entirely. 

* Destructuring in lambdas: 
  * If a lambda has a parameter of the `Pair` type, or `Map.Entry`
  * destructuring declarations can be used
  * several new parameters instead of one are put in parentheses.

&nbsp;

### Common operations on collections
* These are defined as extension functions in the Kotlin standard library.
* There is no need to convert to 'Stream' before calling them. 
* There is also no need to 'collect' the result back to a collection. 
#### Table of common operations
| fun           | parameter                              | return               | e.g.                                |
|---------------|----------------------------------------|----------------------|-------------------------------------|
| filter        | predicate                              | new collection       |                                     |
| map           | transform fun                          | new collection       |                                     |
| any/all/none  | predicate                              | bool                 |                                     |
| find          | predicate                              | nullable             |                                     |
| first         | predicate                              | element              |                                     |
| firstOrNull   | predicate                              | nullable             |                                     |
| partition     | predicate                              | Pair of lists        | (match, rest)                       |
| groupBy       | key generator                          | Map of key and lists | {3=[one, two], 5=[three], 4=[four]} |
| associateBy   | key generator                          | Map                  | {3=two, 5=three, 4=four}            |
| associateWith | value generator                        | Map                  | {one=3, two=3, three=5, four=4}     |
| associate     | entry generator                        | Map                  |                                     |
| flatten       |                                        | new collection       | only flatten one level              |
| flatMap       | mapping fun                            | new collection       | map then flatten                    |
| reduce        | fun that takes in left and right value | single element       |                                     |
| zip           | another iterable                       | list of pairs        |                                     |
|               |                                        |                      |                                     |


* `flatMap` between Kotlin and Java:
  * mapper function in Java `flatMap` returns a `stream`
  * mapper function in Kotlin `flatMap` returns a `collection`

&nbsp;

&nbsp;
----
### Useful links ###
* []()