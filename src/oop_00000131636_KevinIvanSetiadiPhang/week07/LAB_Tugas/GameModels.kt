package oop_00000131636_KevinIvanSetiadiPhang.week07.LAB_Tugas

data class GameItem(
    val name: String,
    val damage: Int,
    val rarity: ItemRarity
)

enum class ItemRarity(val dropChance: Int) {
    COMMON(70),
    UNCOMMON(40),
    RARE(20),
    EPIC(5),
    LEGENDARY(1);

}