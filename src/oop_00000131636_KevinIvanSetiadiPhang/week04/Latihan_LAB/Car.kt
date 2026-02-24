package oop_00000131636_KevinIvanSetiadiPhang.week04.Latihan_LAB

//car " is-a" vehicle. parameter brand dilempar ke atas melalui vehicle(brand)
open class Car(brand: String, val numberOfDoors: Int) : Vehicle(brand) {

    fun openTrunk(){
        println("Bagasi mobil $brand dengan $numberOfDoors pintu dibuka")
    }
    override fun honk() {
        println("TIN TIN! Mobil $brand lewati!")
    }

    override fun accelerate(){
        super.accelerate() // memanggil logika penambahan kecepatan milik parent
        prinntln("Mobil $brand menggunakan transmisi gigi untuk menambah kecepatan.")
    }
}