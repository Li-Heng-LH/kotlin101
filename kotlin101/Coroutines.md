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

### 2
* 3 ways to create a coroutine: 
  * `launch`
  * `async`
  * `runBlocking`
  * 

&nbsp;
