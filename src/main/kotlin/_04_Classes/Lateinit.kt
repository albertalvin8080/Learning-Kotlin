package _04_Classes

class MyClass {
    lateinit var name: String
}

fun main() {
    val x = MyClass()

    try {
        println(x.name) // ERR
    } catch (e: UninitializedPropertyAccessException) {
        println(e)
    }

    x.name = "Franz"
    println(x.name) // OK
}