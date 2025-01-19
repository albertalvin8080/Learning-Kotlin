package _08_Loops

fun main() {
    // inclusive
    for (i in 1..10) {
        print("$i ")
    }
    println()

    // exclusive
    for (i in 1 until 10) {
        print("$i ")
    }
    println()

    for (i in 1 until 10 step 3) {
        print("$i ")
    }
    println()

    // inclusive
    for (i in 10 downTo 1) {
        print("$i ")
    }
    println()

    for (i in 10 downTo 1 step 2) {
        print("$i ")
    }
    println()
}