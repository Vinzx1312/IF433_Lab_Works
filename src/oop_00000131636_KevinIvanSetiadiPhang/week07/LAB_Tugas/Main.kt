package oop_00000131636_KevinIvanSetiadiPhang.week07.LAB_Tugas

fun main() {
    GameManager.startGame()
    GameManager.startGame()

    println("Drop chance LEGENDARY: ${ItemRarity.LEGENDARY.dropChance}%")

    val starterWeapon = Weapon.forgeStarterSword()
    println("Senjata awal: ${starterWeapon.item.name}, Damage: ${starterWeapon.item.damage}")

    val upgradedItem = starterWeapon.item.copy(damage = 25)

    processEvent(BattleState.SafeZone)
    processEvent(BattleState.MonsterEncounter("Goblin Nakal"))
    processEvent(BattleState.LootDropped(upgradedItem))
    processEvent(BattleState.GameOver("Terkena jebakan racun"))


}
