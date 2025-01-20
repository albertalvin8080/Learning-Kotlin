package _10_Generics

abstract class Product(val name: String, val price: Float) {
    override fun toString(): String {
        return "Product(name='$name', price=$price)"
    }
}
class Snack(name: String, price: Float) : Product(name, price)
class Lunch(name: String, price: Float) : Product(name, price)
@JvmInline
value class Coin(val value: Float)

//class VendingMachine<in T>(private val list: List<T>) { // Not ok for returning
//class VendingMachine<out T>(private val list: List<T>) { // Not ok for receiving
class VendingMachine<T>(private val list: List<T>) {
    fun purchase(money: Coin): T {
        return list.random()
    }
    fun refund(t: T): Coin {
        return Coin(0f)
    }
}

fun main() {
    val l = listOf(
        Lunch("Chicken", 11.5f),
        Snack("Chocolate", 2f),
    )
    val m1: VendingMachine<in Product> = VendingMachine(l)
    val m2: VendingMachine<out Product> = VendingMachine(l)
    val m3: VendingMachine<*> = VendingMachine(l)

    println(m1.purchase(Coin(0f)))
    println(m2.purchase(Coin(0f)))
    println(m3.purchase(Coin(0f)))
}