package _04_Classes

class AppUser(val name: String) {
    init {
        println("Inside init $name")
    }
}

fun main() {
    val a1 = AppUser("Franz")
    val a2 by lazy {
        AppUser("Helmuth")
    }

    println("--- main ---")
    a2.name
}