package oop_00000131636_KevinIvanSetiadiPhang.week03.Tugas_LAB

fun main() {

    // ===== Testing Weapon =====
    val weapon = Weapon("Sawiter")

    weapon.damage = -50
    weapon.damage = 9999

    println("Tier weapon: ${weapon.tier}")

    println("========================")

    // ===== Testing Player =====
    val player = Player("Bahlil")

    // player.xp  // ini harus error (karena private)

    player.addXp(50)   // masih level 1
    player.addXp(60)   // total 110 → level 2
}
