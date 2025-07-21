package coroutines

import kotlinx.coroutines.*

fun main() {
    runBlocking {
        val job = launch {
            delay(1000L) // non-blocking delay for 1 second (default time unit is ms)
            println("World!") // print after delay
        }
        println("Hello") // main coroutine continues while a previous one is delayed
        job.join() // wait until child coroutine completes
        println("Done")
    }
}
