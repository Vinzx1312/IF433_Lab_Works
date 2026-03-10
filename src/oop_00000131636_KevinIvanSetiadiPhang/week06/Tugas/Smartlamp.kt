package oop_00000131636_KevinIvanSetiadiPhang.week06.Tugas

class SmartLamp(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable {

    override fun turnOn() {
        println("[$name] Lampu menyala dengan cahaya hangat 2700K.")
    }

    override fun turnOff() {
        println("[$name] Lampu dimatikan.")
    }
}