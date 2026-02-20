package oop_00000131636_KevinIvanSetiadiPhang.week03.Tugas_LAB

class Weapon(val name: String) {

    var damage: Int = 0
    set(value) {
        if (value < 0) {
            println("Damage tidak boleh negatif bang!")
            return
        }

        field = if (value > 1000) {
            println("Damage terlalu besar! (fix cheat) Di-set menjadi 1000.")
            1000
        } else {
            value
        }
    }

    val tier: String
    get() = when {
        damage > 800 -> "Legendary"
        damage > 500 -> "Epic"
        else -> "Common"
    }
}