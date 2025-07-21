package coroutines

import kotlinx.coroutines.*

fun main() =
    runBlocking {
        launch {
            doWorld()
        }
        println("Hello")
    }

private suspend fun doWorld() {
    delay(1000L)
    println("World!")
}