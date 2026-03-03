package oop_00000131636_KevinIvanSetiadiPhang.week05.Lab

fun main() {
    val dosen1 = Dosen(nama = "Pak alek", nidn= "0123456")
    val admin1 = Admin(nama = "pak jokowi")

    //teks polymorphic collection: liust yang berisi tipe parent tappi isinya objek anak
    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for (pegwai in daftarPegawai) {
        //Pemanggilan runtime polymmorphism
        pegawai.bekerja()

        //pegawai.mengajar() // INI AKAN ERROR KAERENA TIPE REFERENSI ADALAH PEGAWAI

        // smart castig dengan is dan when
        when(pegawai) {
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai})")
                pegawai.mengajar() // smart cast! tidak perlu manual casting
            }
            is Admin -> {
                println("=> Terdeteksi sebgai Admin")
                pegawai.doAdminWork()
            }
        }
        println("-----------------------------"
    }

}