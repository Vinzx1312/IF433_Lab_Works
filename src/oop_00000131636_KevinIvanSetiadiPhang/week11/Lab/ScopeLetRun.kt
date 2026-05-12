package oop_00000131636_KevinIvanSetiadiPhang.week11.Lab

fun main() {
    // CHECKPOINT 4: let function for null safety
    println("=== TEST LET FUNCTION ===")
    val name: String? = "Alexander"

    // Mengeksekusi blok hanya jika objek tidak null
    val length = name?.let {
        println("Nama terdeteksi: $it") // 'it' merujuk pada name
        it.length // Mengembalikan nilai expression terakhir
    }
    println("Panjang nama: $length")

    // CHECKPOINT 5: run function for object computation
    println("\n=== TEST RUN FUNCTION ===")
    val result = "Kotlin".run {
        println("Memproses kata: ${this}") // 'this' bisa dihilangkan (implicit)
        this.length * 2//
    }
    println("Hasil kalkulasi run: $result")
}