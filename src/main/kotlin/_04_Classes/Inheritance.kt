package _04_Classes

open class Animal public constructor(val name: String) {
    protected open var species: String? = null

    open fun printInfo() = println("name:$name")
}

class Bear(name: String): Animal(name) {
    override var species: String? = "Bear Bears"
        get() = field
        set(value) {field = value}

    override fun printInfo() {
        println("name:${super.name} species:$species")
    }
}

fun main() {
    val b1 = Bear("Detestatio")
    b1.printInfo()
}