package _04_Classes

import java.util.UUID

enum class EntityType {
    PLAYER, NPC, ENEMY, GENERIC;
}

object EntityFactory {
    fun create(type: EntityType): Entity {
        return when(type) {
            EntityType.PLAYER -> Entity.Player("Franz")
            EntityType.NPC -> Entity.Npc("Johan", UUID.randomUUID())
            EntityType.ENEMY -> Entity.Enemy("Tenma", UUID.randomUUID())
            EntityType.GENERIC -> Entity.Generic
        }
    }
}

// All subclasses must be inside the same kotlin file.
sealed class Entity {
    companion object Generic : Entity() {
        const val GENERIC_PROPERTY = ""
    }

    data class Player(val name: String) : Entity()
    data class Npc(val name: String, val uuid: UUID) : Entity()
    data class Enemy(val name: String, val uuid: UUID) : Entity()
}

fun main() {
    val e = EntityFactory.create(EntityType.ENEMY)
    when(e) {
        Entity.Generic -> println("It's a generic entity")
        is Entity.Player -> println("It's a Player")
        is Entity.Npc -> println("It's a NPC")
        is Entity.Enemy -> println("It's an Enemy")
    }
    println(e)
}