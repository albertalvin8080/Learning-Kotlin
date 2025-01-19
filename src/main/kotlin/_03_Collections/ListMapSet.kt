package org.albert._03_Collections

fun main() {
    val arr = arrayOf(1, 2, 3)
    arr.forEachIndexed { index, i -> println("$index - $i") }

    val mList = mutableListOf(1, 2, 3, 4)
    mList.add(6)
    mList.forEach { item ->
        print("$item ")
    }
    println()

    // `K to V` is used to create a Pair object.
    val map = mutableMapOf(1 to "Franz", 2 to "Helmuth")
    map[3] = "Jakub"
    map.forEach { (k, v) -> println("$k: $v") }

    val set = mutableSetOf(1, 2, 3)
    set.add(1); set.add(2)
    set.add(4)
    set.forEach { print("$it ") }
    println()
}
