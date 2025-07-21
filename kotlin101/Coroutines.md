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
* new coroutines can only be launched in a specific CoroutineScope 
* which delimits the lifetime of the coroutine.
* `runBlocking` establishes the corresponding scope
* **Structured concurrency** ensures that they are not lost and do not leak.
* An outer scope **cannot complete until** all its children coroutines complete.

&nbsp;

### Cancellation is cooperative
* Coroutines are cancellable, but cancellation is cooperative.
* This means that a coroutine must check for cancellation explicitly and handle it.
* This is achieved using mechanisms like `isActive`, `yield`, or **cancellation-aware suspending functions** 
* (e.g., `delay` or `withContext`).


### Basics
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

* `suspend` function: 
* additional feature is that they can, in turn, use other suspending functions (like `delay` in this example) 
* to suspend execution of a coroutine.

* `coroutineScope`: Scope builder
* `runBlocking` and `coroutineScope` builders both wait for their body and all its children to complete.
* The main difference is that the `runBlocking` blocks the current thread for waiting, 
* while `coroutineScope` just suspends, releasing the underlying thread for other usages. 
* `runBlocking` is a **regular** function while `coroutineScope` is a **suspending** function.

* A `coroutineScope` builder can be used inside any suspending function to perform multiple concurrent operations.

* A `launch` coroutine builder returns a `Job` object that is a handle to the launched coroutine and 
* can be used to wait for its completion explicitly.

* `async` coroutine builder returns a `Deferred` object that is a handle to the launched coroutine and
* can be used to wait for its completion and get the result of the coroutine.

* Coroutine context: 
* The `coroutine context` includes a coroutine `dispatcher` that 
* determines what thread or threads the corresponding coroutine uses. 
* The coroutine dispatcher can **confine coroutine execution** to 
  * a specific thread, 
  * dispatch it to a thread pool, 
  * or let it run unconfined.
* `Dispatchers.Default` uses a shared background pool of threads.
* `newSingleThreadContext` creates a thread for the coroutine to run. 
  * A dedicated thread is a very expensive resource. 
  * In a real application it must be either released, when no longer needed, using the close function, 
  * or stored in a top-level variable and reused throughout the application.


&nbsp;




