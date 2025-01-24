package _01_Functions

fun inlineFunction(action: () -> Unit) {
    action()
}

fun someFun() {
    inlineFunction {
        println("Inside lambda")
        return@inlineFunction
    }
}

fun main() {
    someFun()
}
