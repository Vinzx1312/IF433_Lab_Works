package oop_00000131636_KevinIvanSetiadiPhang.week06.Lab

class SmartSpeaker(
    override val id: String,
    override val name: String
) : SmartDevice, Switchable {

    override fun turnOn() {
        println("[$name] Speaker aktif dan siap menerima perintah suara.")
    }

    override fun turnOff() {
        println("[$name] Speaker dimatikan. Sampai jumpa!")
    }

    fun playMusic(song: String) {
        println("[$name] Memutar lagu $song dari Spotify.")
    }
}