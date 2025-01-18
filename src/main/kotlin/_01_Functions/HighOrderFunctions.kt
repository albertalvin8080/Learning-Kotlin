package _01_Functions

fun printFiltered(list: List<String>, predicate: (String) -> Boolean) {
    list.forEach {
        if (predicate(it)) println(it)
    }
}

fun printFilteredNullable(list: List<String>, predicate: ((String) -> Boolean)?) {
    list.forEach {
        if (predicate?.invoke(it) == true) {
            println(it)
        }
    }
}

val predicate: (String) -> Boolean = { s ->
    s.startsWith("S")
}

fun main() {
    val l = listOf("Summa", "Blasphemia", "Detestatio", "Sacrorum")
    printFiltered(l) { it.startsWith("S") }
    printFiltered(l, predicate)
    printFilteredNullable(l, null)
}