package _09_Delegation

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class FormatProperty : ReadWriteProperty<Any?, String> {
    // You could also put this inside the primary constructor
    private var someProperty: String = ""

    override fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return this.someProperty.uppercase()
    }

    override fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        this.someProperty = value
    }
}

class NamesClass {
    var name1 by FormatProperty()
    var name2 by FormatProperty()

    override fun toString(): String {
        return "NamesClass(name1='$name1', name2='$name2')"
    }
}

fun main() {
    val n = NamesClass()
    println(n)
    n.name1 = "Franz Bonaparta"
    n.name2 = "Helmuth Voss"
    println(n)
}