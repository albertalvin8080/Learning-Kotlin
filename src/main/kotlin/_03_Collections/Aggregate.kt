package _03_Collections

fun main() {
    val s = setOf(3f, 5f, 7f, 3.33f, 75f, 34f)
    println(s.maxOrNull())
    println(s.maxByOrNull { it < 50f })
    println(s.minOrNull())
    println(s.average())
}