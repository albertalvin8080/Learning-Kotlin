package org.albert

import kotlin.random.Random

var message: String? = "Summa Blasphemia"

fun main() {
    val rand = Random(999).nextInt(10);
    val result =
        if (rand >= 5) {
            "x >= 5"
        } else {
            "x < 5"
        }
    println(result)

//    message = null
    message = when (message) {
        null -> "Detestatio Sacrorum"
        else -> message
    }
    println(message)
}