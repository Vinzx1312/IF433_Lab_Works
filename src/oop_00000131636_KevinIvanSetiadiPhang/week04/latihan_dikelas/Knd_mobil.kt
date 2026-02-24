package oop_00000131636_KevinIvanSetiadiPhang.week04.latihan_dikelas

class Knd_mobil: Kendaraan()  {
    private var jmlBan: Int =0;

    init {
        jmlBan = 4;
        println("Mobil Punya  $jmlBan");
        super.jalan_maju()
    }

    override fun jalan_maju(){
        println("Mobil majuuuu")
    }

}