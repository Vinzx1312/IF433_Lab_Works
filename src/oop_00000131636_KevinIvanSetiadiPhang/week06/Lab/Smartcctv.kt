package oop_00000131636_KevinIvanSetiadiPhang.week06.Lab

class SmartCCTV(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable, Recordable {

    override fun turnOn() {
        println("[$name] Kamera CCTV menyala.")
        startRecord() // Otomatis mulai rekam saat dinyalakan
    }

    override fun turnOff() {
        println("[$name] Kamera CCTV dimatikan.")
        stopRecord()
    }

    override fun startRecord() {
        println("[$name] Mulai merekam video beresolusi 1080p...")
    }
}