package _03_Collections

fun main() {
    val l1 = listOf("Franz", "Bonaparta", "Helmuth", "Voss", "Jakub", "Farobek", "January", "Hoss")
    println(l1.groupBy { it.first().uppercase() })
    println(l1.groupBy(keySelector = { it.first().uppercase() }, valueTransform = { it.uppercase() }))
}