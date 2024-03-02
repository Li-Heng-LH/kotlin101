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

* Can I omit parameter type in kotlin?  
Yes, in Kotlin, you can omit the parameter types in function declarations if the compiler can infer them from the context.

&nbsp;

### Top-Level Functions ###
* functions defined outside any class.
* ideal for replacement of Java Utility class static methods. 
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
----
### Useful links ###
* []()