package oop_00000131636_KevinIvanSetiadiPhang.week06.Lab
class Smartwatch : Watch(), BluetoothConnectable, Rechargeable {
    override fun showTime() {
        println("Layar OLED menyala: 14:00WIB")
    }

    override fun connetToBluetooth() {
        println("Mnecari perangat HP di sekitar untuk pairing...")
    }

    override fun chargeBattery() {
        println("Mengisi daya menggunakan charger magneik 1SW.")
    }
}