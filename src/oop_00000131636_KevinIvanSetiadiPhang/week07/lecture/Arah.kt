package oop_00000131636_KevinIvanSetiadiPhang.week07.lecture

enum class Arah ( val petunjuk: String){
    Atas(petunjuk = "naik"),
    Bawah(petunjuk = "turun"),
    Kiri(petunjuk = "Belok"),
    Kanan(petunjuk = "mengsong");

    fun tampilkan_isi_param() {
        println("arhh ke petunjuk")
    }
}