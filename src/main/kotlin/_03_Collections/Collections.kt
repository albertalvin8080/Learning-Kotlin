package org.albert._03_Collections

fun main() {
    var arr = arrayOf(1, 2, 3)
    arr.forEachIndexed { index, i -> println("$index - $i") }

    var mList = mutableListOf(1, 2, 3, 4)
    mList.add(6)
    mList.forEach { item ->
        print("$item ")
    }
    println()

    // `K to V` is used to create a Pair object.
    var map = mutableMapOf(1 to "Franz", 2 to "Helmuth")
    map.put(3, "Jakub")
    map.forEach { (k, v) -> println("$k: $v") }
}