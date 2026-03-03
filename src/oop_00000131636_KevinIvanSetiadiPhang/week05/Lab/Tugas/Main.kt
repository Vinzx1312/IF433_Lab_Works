package oop_00000131636_KevinIvanSetiadiPhang.week05.Lab.Tugas

fun main() {

    println("===== TEST MATH HELPER =====")

    val math = MathHelper()

    println("Luas Persegi: ${math.hitungLuas(4)}")
    println("Luas Persegi Panjang: ${math.hitungLuas(4, 5)}")
    println("Luas Lingkaran: ${math.hitungLuas(7.0)}")
}