package oop_00000131636_KevinIvanSetiadiPhang.week06.Lab

interface Clickable {
    val name: String
    fun click()
}

class Button (override val name: String) : Clickable  {
    override fun click() {
        println("Tombol '$name' berhasil diklik!")
    }
}