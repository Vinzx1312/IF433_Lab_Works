package oop_00000131636_KevinIvanSetiadiPhang.week04.Tugas1

import oop_00000131636_KevinIvanSetiadiPhang.week04.Latihan_LAB.Car

// ElectricCar adalah Child dari class Car
class ElectricCar(brand: String, numberOfDoors: Int, val batteryCapacity: Int) : Car(brand, numberOfDoors) {

    // Tambahkan keyword final agar tidak bisa di-override lagi oleh keturunan berikutnya
    final override fun accelerate() {
        println("$brand berakselerasi dalam sunyi. Kapasitas baterai: $batteryCapacity%.")
    }

    // Method honk() tetap menggunakan implementasi dari Car (tidak perlu di-override ulang)
    // Method openTrunk() tetap menggunakan implementasi dari Car
    // check point 6
}