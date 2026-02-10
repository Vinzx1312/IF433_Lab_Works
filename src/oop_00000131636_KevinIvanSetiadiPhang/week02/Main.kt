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
    print("Pilih Jalur (1. Reguler, 2. Umum): ")
    val type = scanner.nextInt()
    scanner.nextLine() // consume newline

    if (type == 1) {
        print("Masukkan Jurusan: ")
        val major = scanner.nextLine()

        // Primary Constructor
        val s1 = Student(name, nim, major)
        println("Terdaftar di: ${s1.major} dengan GPA awal ${s1.gpa}")

    } else if (type == 2) {
        // Secondary Constructor
        val s2 = Student(name, nim)
        println("Terdaftar di: ${s2.major} dengan GPA awal ${s2.gpa}")

    } else {
        println("Pilihan ngawur, pendaftaran batal!")
    }
}