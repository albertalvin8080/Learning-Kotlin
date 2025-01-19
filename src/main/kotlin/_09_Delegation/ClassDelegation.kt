package _09_Delegation

interface A {
    fun printA()
}

interface B {
    fun printB()
}

class ImplementationA : A {
    override fun printA() {
        println("Impl A")
    }
}

class ImplementationB : B {
    override fun printB() {
        println("Impl B")
    }
}

/*
 * `A by ImplementationA()`
 * >> Use the implementation of interface A provided by class ImplementationA
 * `B by ImplementationB()`
 * >> Use the implementation of interface B provided by class ImplementationB
 */
class MyClass : A by ImplementationA(), B by ImplementationB() {}

fun main() {
    val m = MyClass()
    m.printA()
    m.printB()
}