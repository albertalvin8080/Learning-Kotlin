package _03_Collections

fun main() {
    val l1 = listOf("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N")
    println(l1.chunked(4))
    println(l1.chunked(4) { it.joinToString(separator = "") })
    println(l1.windowed(4, step = 1))
    println(l1.windowed(4, step = 1) { it.joinToString(separator = "") })
}