package coroutines

import kotlinx.coroutines.*

fun main() =
    runBlocking { // this: CoroutineScope
        launch { // launch a new coroutine and continue
            delay(1000L) // non-blocking delay for 1 second (default time unit is ms)
            println(Thread.currentThread().name + " World!") // print after delay
        }
        println(Thread.currentThread().name + " Hello") // main coroutine continues while a previous one is delayed
    }

/**
 * main Hello
 * main World!
 */