package oop_00000131636_KevinIvanSetiadiPhang.week07.LAB_Tugas


class Weapon private constructor(
    val item: GameItem,
    val durability: Int
) {
    companion object {

        fun forgeStarterSword(): Weapon {
            val item = GameItem("Pedang Kayu Bapuk", 5, ItemRarity.COMMON)
            return Weapon(item, 50)
        }

        fun forgeEpicSword(): Weapon {
            val item = GameItem("Pedang Naga", 100, ItemRarity.EPIC)
            return Weapon(item, 200)
        }
    }
}
