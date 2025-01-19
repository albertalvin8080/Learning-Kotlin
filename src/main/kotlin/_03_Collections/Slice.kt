package _03_Collections

fun main() {
    val l1 = listOf("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N")
    println(l1.slice(0..6 step 2))
    println(l1.slice(0 until 6 step 2))
    println(l1.slice(setOf(5, 0, 1)))
}