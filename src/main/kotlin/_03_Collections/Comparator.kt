package _03_Collections

class Author(var name: String, var age: Int) {
    override fun toString(): String {
        return "Author(name='$name', age=$age)"
    }
}

fun main() {
    val l1 = listOf(
        Author("Franz", 39),
        Author("Emil", 48),
        Author("Jakub", 29),
        Author("Helmuth", 50),
    )
    println(l1.sortedWith(compareBy { it.age }))
    println(l1.sortedBy{ it.age }.reversed())
}