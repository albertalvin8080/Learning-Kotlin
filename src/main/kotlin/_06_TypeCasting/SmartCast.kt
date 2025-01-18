package _06_TypeCasting

interface Animal {
    var name: String
    fun makeNoise()
}

class Person(override var name: String) : Animal {
    override fun makeNoise() {}
    fun commitSin() = println("Summa Blasphemia")
}

fun sin(a: Animal) {
//    a.commitSin() // ERR
    if (a is Person) {
        (a as Person).commitSin()
        a.commitSin() // Compiler performs Smart Cast
    } else {
        println("Cannot commit sin")
    }
}

fun main() {
    // object expression for anonymous class
    sin(object : Animal {
        override var name: String = ""
        override fun makeNoise() {}
    })

    sin(Person(name = "Franz"))
}