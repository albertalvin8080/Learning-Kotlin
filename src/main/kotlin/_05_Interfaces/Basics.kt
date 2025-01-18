package _05_Interfaces

interface Animal {
    abstract val name: String
    fun makeSound()
}

class Cat(override val name: String, private val age: Int) : Animal {
    override fun makeSound() {
        println("Cat($name, $age) says: pay for your sins.")
    }
}

fun main() {
    val a1 = Cat("bimbo", 10)
    a1.makeSound()
}