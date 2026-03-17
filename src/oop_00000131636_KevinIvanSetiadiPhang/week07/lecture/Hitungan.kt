package oop_00000131636_KevinIvanSetiadiPhang.week07.lecture

class Hitungan private constructor(val tipe :String) {
    init {
        println("isi param class: ${tipe}")
    }
    companion object {
        const val namaMtk: String ="Matematika"

        fun tambah(a: Int, b: Int) {
            println("Hasil penambahan: " +(a+b))
        }
        fun kali(a: Int, b: Int) {
            println("Hasil perkalian: " +(a*b))
        }

        fun buat_data(tipeUser: String) {
            Hitungan(tipeUser)
        }
    }
}