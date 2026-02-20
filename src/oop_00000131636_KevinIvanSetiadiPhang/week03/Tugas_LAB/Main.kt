package oop_00000131636_KevinIvanSetiadiPhang.week03.Tugas_LAB

fun main() {

    val weapon = Weapon("Excalibur")

    weapon.damage = -50     // harus gagal
    weapon.damage = 9999    // harus jadi 1000

    println("Tier weapon: ${weapon.tier}")
}
