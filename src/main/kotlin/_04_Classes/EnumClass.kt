package _04_Classes

import java.util.*

enum class Dificulty {
    EASY, MEDIUM, HARD;

    fun getNameCapitalized() =
        name.lowercase().replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
}

fun main() {
    val e = Dificulty.EASY

    val representation = when (e) {
        Dificulty.EASY -> e.getNameCapitalized()
        Dificulty.MEDIUM -> e.name
        Dificulty.HARD -> e.ordinal
    }

    println(representation)
}