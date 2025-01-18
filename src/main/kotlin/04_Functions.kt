package org.albert

fun sayHello(greeting: String = "Hi!", vararg name: String = arrayOf("Johan")): Unit {
    println("$greeting ${name.contentToString()}")
}

fun main() {
    sayHello()
    sayHello(name = *arrayOf("Franz Bonaparta"))
    sayHello(
        greeting = "Detestatio Sacrorum,",
        name = arrayOf("Franz", "Helmuth", "Emil")
    )
    sayHello("Hello,", "Bonaparta", "Voss", "Sébe")
}