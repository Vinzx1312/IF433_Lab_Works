package oop_00000131636_KevinIvanSetiadiPhang.week06.latihan

import oop_00000131636_KevinIvanSetiadiPhang.week06.latihan.Mahasiswa
import oop_00000131636_KevinIvanSetiadiPhang.week06.latihan.Siswa

class KRS(
    override val nama: String,
    override val namaSiswa: String) : Mahasiswa, Siswa {

    override fun belajar(){
        println("si $nama sedang belajar")
        println("siswa $namaSiswa sedang belajar juga")
    }

    override fun mandi() {
        TODO("Not yet implemented")
    }
}