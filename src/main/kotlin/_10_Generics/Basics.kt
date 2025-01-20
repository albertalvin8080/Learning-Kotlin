package _10_Generics

abstract class Player(var name: String)
class SoccerPlayer(name: String) : Player(name)
class BasketPlayer(name: String) : Player(name)

class Team<T : Player>(private val list: List<T>) {
    fun printAll() {
        this.list.forEach { print("$it ") }
    }
}

fun main() {
    val t = Team(mutableListOf(
            SoccerPlayer("Franz"),
            SoccerPlayer("Emil"),
            BasketPlayer("Helmuth"),
        ))
    t.printAll()
}