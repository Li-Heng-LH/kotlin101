package coroutines

import kotlinx.coroutines.*

/**
 * main Hello
 * main World!
 */
fun main() = runBlocking { // this: CoroutineScope
    launch { // launch a new coroutine and continue
        delay(1000L) // non-blocking delay for 1 second (default time unit is ms)
        println(Thread.currentThread().name + " World!") // print after delay
    }
    println(Thread.currentThread().name  + " Hello") // main coroutine continues while a previous one is delayed
}
