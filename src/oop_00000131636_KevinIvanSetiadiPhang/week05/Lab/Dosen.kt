package oop_00000131636_KevinIvanSetiadiPhang.week05.Lab

class Dosen(nama: String, val nidn: String) : Pegawai(nama) {
    //teks wajib di override karena fungsi bekejrk() bersifat abstract di pareng
    override fun bekerja() {
        println("[$nama] sedang menyiapkan materi perkuliahan dan merevisi RPKPS. ")
    }

    //Fungsi unitk/spesifik yang hanya dimiliki dosen
    fun mengajar(){
        println("[$nama] sedang mengajar mahasiswa di kelas.")
    }
}