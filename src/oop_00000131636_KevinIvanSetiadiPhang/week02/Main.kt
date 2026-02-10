package oop_00000131636_KevinIvanSetiadiPhang.week02

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("--- APLIKASI PM UMN ---")

    print("Memasukkan Nama: ")
    val name= scanner.nextLine()

    print("Memasukkan NIM (Wajib 5 karakter):   ")
    val nim= scanner.nextLine()

    scanner.nextLine() // bersihkan buffer newline (penyakit klasik scanner)

    //validasi di sisi pemanggil (main)

    if(nim.length != 5) {
        println("ERROR : Pendaftaran dibatalkan, NIM harus 5 karakter!")
        //program berhenti disini untuk mahasiswa ini, tidak membuat objek
    } else {
        print("Memasukkan Jurusan: ")
        val major = scanner.nextLine()

        //onstalasi objek karena data sudah aman
        val s1 = Student(name, nim, major)
        println("Status: Pendaftaran Selesai.")
    }
}