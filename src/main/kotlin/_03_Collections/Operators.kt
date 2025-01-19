package _03_Collections

fun main() {
    val s = mutableSetOf(1, 2, 4)
    println(s)
    s += 7
    println(s)
    s -= mutableSetOf(2, 4)
    println(s)
}