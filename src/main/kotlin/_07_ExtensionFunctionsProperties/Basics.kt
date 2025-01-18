package _07_ExtensionFunctionsProperties

class Animal(val name: String)

fun Animal.makeSound(sound: String?) {
    val _sound = sound ?: "generic song"
    println(_sound)
}

// ERR: Extension Property cannot be initialized because it has no backing field.
//val Animal.age: Int = 39
val Animal.age: Int
    get() = 39

fun main() {
    val a = Animal("Bear")
    a.makeSound("You are the universe acknowledging its own existence.")
    println(a.age)
}