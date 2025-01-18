package _04_Classes

data class User(val name: String, val pwd: String)

data object MySingleton {
    val appVersion = "0.0.1"
    val appName = "Detestatio Sacrorum"

    override fun toString(): String = "$appName v$appVersion"
}