package _04_Classes

data class User(val name: String, val pwd: String)

data object MySingleton {
    const val APP_VERSION = "0.0.1"
    const val APP_NAME = "Detestatio Sacrorum"

    override fun toString(): String = "$APP_NAME v$APP_VERSION"
}

fun main() {
    val u1 = User("Franz", "123")
    println(u1)

    val s = MySingleton
    println(s)
}