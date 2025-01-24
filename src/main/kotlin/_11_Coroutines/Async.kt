package `_11_Coroutines`

import kotlinx.coroutines.*

fun main(args: Array<String>): Unit = runBlocking {
    val response = async {
        request()
    }
    val data = async {
        println("Reading from disk...")
        delay(2_000)
        "data: summa blasphemia"
    }

    launch {
        launch {
            println(response.await())
        }
        launch {
            println(data.await())
        }
    }
}

suspend fun request(): String {
    println("Sending request...")
    delay(3_000)
    return "response: detestatio sacrorum"
}