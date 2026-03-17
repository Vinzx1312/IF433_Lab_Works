package oop_00000131636_KevinIvanSetiadiPhang.week07.lecture

fun main(){
    Koneksi.kon ="localhost:8080"
    println("link ${Koneksi.kon}")
    Koneksi.coba_konek_db()

    Hitungan.tambah(a = 10, b= 20)
    Hitungan.kali(a= 20, b= 20)
    println("Nama matkul: ${Hitungan.namaMtk}")

    Hitungan.buat_data(tipeUser = "user biasa")

    val dt = SaveData( "mario",
        skor = 10,
        highscore = 100,
        currentLevel = 5)
    println("Nama char ${dt.namaChar}")
    println(dt)

    val dtCopy = dt.copy(namaChar = "luigi")
    println("Nama char ${dtCopy.namaChar}")
    println(dtCopy)

    println("=== class ENUM ===")
    val arh = Arah.Atas
    println(arh.tampilkan_isi_param())

    println("=== SEALED Class")

val hsl: Hasil = Hasil.Sukses(data= "berhasil sukses")
    hsl.handle_response(res = hsl)

}

