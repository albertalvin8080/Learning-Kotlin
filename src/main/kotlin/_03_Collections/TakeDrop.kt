package _03_Collections

fun main() {
    val l1 = listOf("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N")
    println(l1.take(5))
    println(l1.takeLast(3))
    println(l1.drop(5))
    println(l1.dropLast(3))
}