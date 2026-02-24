package oop_00000131636_KevinIvanSetiadiPhang.week04.Tugas2

// Parent class harus open agar bisa diwariskan
open class Employee(val name: String, val baseSalary: Int) {

    // Method open bisa di-override oleh child class
    open fun work() {
        println("$name sedang bekerja.")
    }

    // Method untuk menghitung bonus (10% dari baseSalary)
    open fun calculateBonus(): Int {
        return (baseSalary * 0.1).toInt()
    }
} {
}