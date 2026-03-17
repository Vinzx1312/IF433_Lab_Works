package oop_00000131636_KevinIvanSetiadiPhang.week07.LAB_Tugas

fun main() {
    GameManager.startGame()
    GameManager.startGame()

    println("Drop chance LEGENDARY: ${ItemRarity.LEGENDARY.dropChance}%")

    val starterWeapon = Weapon.forgeStarterSword()
    println("Senjata awal: ${starterWeapon.item.name}, Damage: ${starterWeapon.item.damage}")


}
