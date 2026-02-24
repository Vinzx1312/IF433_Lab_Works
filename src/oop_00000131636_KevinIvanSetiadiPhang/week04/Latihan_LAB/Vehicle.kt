package oop_00000131636_KevinIvanSetiadiPhang.week04.Latihan_LAB

//gunakan keyword 'open' agar class bisa diwariskan
open class vehicle(val brand: String) {
    var speed: Int = 0

    // method juga bersifat final secara default, gunakan 'open' agar bisa di-override
    open fun accelerate(){
        speed += 10
        println("$brand melaju. Kecepatan: $speed km/jam")
    }

    open fun honk(){
        println("beep beep!")
    }

}