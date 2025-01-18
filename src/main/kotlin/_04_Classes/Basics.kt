package _04_Classes

abstract class Person

class Author(var name: String, var age: Int) : Person()

class Author2(name: String, age: Int) : Person() {

    companion object {
        val data1 = "some data"
        const val data2 = "some data"
    }

    init {
        println("Inside init 1")
    }

    internal constructor(): this("empty", 0) {
        println("Inside secondary constructor")
    }

    init {
        println("Inside init 2")
    }

    var name: String = name
        get(): String {
            println("Inside get")
            return field
        }
        set(value) {
            println("Inside set")
            field = value
        }

    var age = age
        get() = field
        set(value) { field = value }
}

fun main() {
    val a1 = Author("Franz Bonaparta", 39)

    val a2 = Author2()
    println("${a2.name}, ${a2.age}")
    a2.name = "Helmuth Voss"
    a2.age = 39
    println("${a2.name}, ${a2.age}")

    println("${Author2.data1}, ${Author2.data2}")
}
