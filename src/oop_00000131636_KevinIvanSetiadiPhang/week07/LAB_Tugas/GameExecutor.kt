package oop_00000131636_KevinIvanSetiadiPhang.week07.LAB_Tugas


fun processEvent(event: BattleState) {
    when (event) {

        is BattleState.SafeZone -> {
            println("Pemain berada di zona aman.")
        }

        is BattleState.MonsterEncounter -> {
            println("Bertemu monster: ${event.monsterName}")
        }

        is BattleState.LootDropped -> {
            println("Mendapat loot: ${event.item.name} (Rarity: ${event.item.rarity})")
        }

        is BattleState.GameOver -> {
            println("Game Over! Penyebab: ${event.reason}")
        }
    }
}
