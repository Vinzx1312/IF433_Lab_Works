package oop_00000131636_KevinIvanSetiadiPhang.week05.Lab

class Admin(nama: String) : Pegawai(nama) {
    override fun bekerja() {
        println("[$nama] sedang duduk di depan komputer melayani administrasi.")
    }

//tekss fungsi unik/spesifik yang hanya dimiliki admin

    fun doAdminWork() {
        println("[$nama] sedang merekap data absensi mahasiswa.")
    }
}