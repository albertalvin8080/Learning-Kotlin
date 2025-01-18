package _04_Classes

fun main() {
    val a1 = Author("Franz Bonaparta", 39)

    val a2 = Author2()
    println("${a2.name}, ${a2.age}")
    a2.name = "Helmuth Voss"
    a2.age = 39
    println("${a2.name}, ${a2.age}")

    println("${Author2.data1}, ${Author2.data2}")
}
