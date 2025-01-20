package _01_Functions

val anonymousFunction = fun(name: String) {
    println(name)
}
val lambda = { name: String -> println(name) }

fun commonFunction(name: String) {
    println(println(name))
}

// Fictional class: KFunction1<String, Unit>
val functionReference = ::commonFunction

val n = "SUmma Blasphemia"

fun main() {
    val n = "Detestatio Sacrorum"
    anonymousFunction(n)
    lambda(n)
    commonFunction(n)
    functionReference(n)

    println(functionReference.name)
    // WARNING: This reference refers to the TOP LEVEL VARIABLE being shadowed, not to the local one.
    val x = ::n
    println(x.name)
}