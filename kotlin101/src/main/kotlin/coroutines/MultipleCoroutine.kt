package coroutines

import kotlinx.coroutines.*

// Sequentially executes doWorld followed by "Done"
fun main() =
    runBlocking {
        doWorld()
        println(Thread.currentThread().name + " Done")
    }

// Concurrently executes both sections
private suspend fun doWorld() =
    coroutineScope { // this: CoroutineScope
        launch {
            delay(2000L)
            println(Thread.currentThread().name + " World 2")
        }
        launch {
            delay(1000L)
            println(Thread.currentThread().name + " World 1")
        }
        println(Thread.currentThread().name + " Hello")
    }

/**
main Hello
main World 1
main World 2
main Done
 */