package oop_00000131636_KevinIvanSetiadiPhang.week02.Tugas

import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("--- LIBRARY FINE SYSTEM ---")

    print("Masukkan Judul Buku: ")
    val title = scanner.nextLine()

    print("Masukkan Nama Peminjam: ")
    val borrower = scanner.nextLine()

    print("Masukkan Lama Pinjam (hari): ")
    var duration = scanner.nextInt()

    // validasi durasi tidak boleh minus
    if (duration < 0) {
        println("Durasi tidak valid, otomatis diubah menjadi 1 hari.")
        duration = 1
    }

    // membuat objek Loan
    val loan = Loan(title, borrower, duration)

    // output
    println("\n--- DETAIL PEMINJAMAN ---")
    println("Judul Buku   : ${loan.bookTitle}")
    println("Peminjam    : ${loan.borrower}")
    println("Lama Pinjam : ${loan.loanDuration} hari")
    println("Total Denda : Rp ${loan.calculateFine()}")
}
