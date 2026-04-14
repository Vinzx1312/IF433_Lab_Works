package oop_00000131636_KevinIvanSetiadiPhang.week08

fun main() {
    var nama: String? = "kevin"

    try {


        println("hai $nama")
        println("panjang umur ${nama!!.uppercase()}")
    } catch (e: NullPointerException) {
        println("ada error exeption, ini pesan errornya ${e.message}")
    }

    val mixeData: List<Any?> = listOf(1, "Budi", 10, "Online", null)
    for (item in mixeData) {
        val hasil = item as? String
        if (hasil != null) {
            println(hasil)
        }
    }
}