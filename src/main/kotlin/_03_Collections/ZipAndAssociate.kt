package _03_Collections

fun main() {
    val l1 = listOf("n1", "n2", "n3")
    val l2 = listOf(1, 2, 3)

    (l1 zip l2).forEach { println(it) }

    l1.associate {
        it to it.length
    }
        .forEach { (k, v) -> println("$k : $v") }

    l1.associateBy { it }.forEach { println(it) }

    l1.associateWith { it.length }.forEach { println(it) }
}