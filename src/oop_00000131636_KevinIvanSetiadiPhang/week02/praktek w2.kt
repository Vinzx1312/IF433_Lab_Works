package oop_00000131636_KevinIvanSetiadiPhang.week02

class MyCar {
    public var warna:String ="merah";
    public var kecepatan:Int = 50;

    init {

            if(kecepatan>=70) {
                print("cepet banget")
            } else {
                println("kurang cepet")
            }
        }

    constructor(speed:Int=10, brake:Double=1.3) {
    kecepatan = speed;
        println("ini dari di secondary constructor $kecepatan dan $brake");
    }

    fun kecepatan() {
        println("kecepatannya $warna luar biasa")
    }
    fun mulai_jalan() {
        println("kecepatannya $warna luar biasa")
    }
}

fun main() {
    val myCar = MyCar( speed = 100, brake = 5.4);
    myCar.kecepatan()
    myCar.mulai_jalan()
    myCar.warna ="kuning";

    println("Warna mobil ${myCar.warna}");
}
