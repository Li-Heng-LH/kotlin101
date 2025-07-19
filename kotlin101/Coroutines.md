# Kotlin coroutines

## Some Learning Notes ##

### 1
* Using Kotlin coroutines is Google's official recommendation for asynchronous programming on Android.
* A suspend function is a function that can perform its task by suspending the thread without blocking it, so the thread can still run other tasks.  
* When the suspending function is done, the current thread will resume execution.
* Coroutines follow a principle of structured concurrency.

* a coroutine is not bound to any particular thread. It may suspend its execution in one thread and resume in another one.
* 
&nbsp;

### Structured concurrency
* 

&nbsp;

### 2
* 3 ways to create a coroutine / coroutine builder: 
  * `launch`
  * `async`
  * `runBlocking`

* coroutine builder: 
  * `launch` is used to start a new coroutine that does not return a result.
  * `async` is used to start a new coroutine that returns a result.
  * `runBlocking` is used to block the current thread until the coroutine completes.

* `delay` is a special **`suspending`** function. 
* It suspends the coroutine for a specific time. 
* Suspending a coroutine does not block the underlying thread, but allows other coroutines to run,
* and use the underlying thread for their code. 
* This is different from `Thread.sleep`, which blocks the thread. 

* `runBlocking` is also a coroutine builder that 
* **bridges the non-coroutine world of a regular fun main() and the code with coroutines inside of runBlocking**. 
* This is highlighted in an IDE by `this: CoroutineScope` hint right after the runBlocking opening curly brace. 
* without `runBlocking`, `launch` will fail to be resolved, 
* because it is an extension function of `CoroutineScope`. 
* The name of `runBlocking` means that the thread that runs it 
* (in this case — the main thread) gets blocked for the duration of the call, 
* until all the coroutines inside `runBlocking` complete their execution. 
* You will often see runBlocking used like that at the very top-level of the application and quite rarely inside the real code. 

&nbsp;
