package coroutines

import kotlinx.coroutines.*

fun main() =
    runBlocking {
        doHelloWorld()
    }

private suspend fun doHelloWorld() =
    coroutineScope {  // this: CoroutineScope
        launch {
            delay(1000L)
            println("World!")
        }
        println("Hello")
    }
