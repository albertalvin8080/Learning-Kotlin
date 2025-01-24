package _11_Coroutines

import kotlinx.coroutines.*

// For some reason, the jvm only recognizes this as main if it receives args and returns Unit type.
fun main(args: Array<String>): Unit = runBlocking {
    var n = 0
    launch {
        for (i in 0..5) {
            println("launch 1 -> ${++n}")
            yield()
        }
    }

    launch {
        for (i in 0..5) {
            println("launch 2 -> ${++n}")
            yield()
        }
    }
}