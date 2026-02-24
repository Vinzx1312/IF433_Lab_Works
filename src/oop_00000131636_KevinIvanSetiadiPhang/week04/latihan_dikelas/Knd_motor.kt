package oop_00000131636_KevinIvanSetiadiPhang.week04.latihan_dikelas

class Knd_motor: Kendaraan() {
    private var jmlBan: Int = 0;

    init {
        jmlBan = 2;
        println("Motor saya $jmlBan ban");
    }
}