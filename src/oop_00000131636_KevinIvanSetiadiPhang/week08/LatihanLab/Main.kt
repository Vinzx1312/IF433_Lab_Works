package oop_00000131636_KevinIvanSetiadiPhang.week08.LatihanLab

import java.text.ListFormat

fun main() {
    println("===TEST SAFE CALLS & ELVIS ===")
    val emptyOrder = Order(null,null)

    //rantai safe calss yang elegan
    val destinantion = emptyOrder.deliveryDetails?.address?.city?.name ?: "Kota tidak diketahui"
    println("tujuan pengiriman : $destinantion")

    println("\n=== TEST LET BLOCK ===")
    val validOrder = Order(null, 250000)

    val receipt = validOrder.totalPrice?.let { price ->
        //blok ini hanya jalan jika totalPrice tidak null
        val tax = price * 0.11
        "Transaksi Valid. Harga: Rp$price, Pajak: Rp$tax"
    } ?: "Transaksi Invalid:Harga Belum di-set!"
    println(receipt)

    println("\n=== TEST SAFE CASTING ===")
    val mixedData: List<Any> = listOf(
        "Smartphone",
        1500000,
        UserProfile("Andi", null),
        "Laptop",
        4500000.0
    )

    for(item in mixedData) {
        val text = item as? String

        //Hanya cetak jika cast sukses (text tidak null)
        text?.let {
            println("Ditemukan teks: ${it.uppercase()}")
        }
    }

    val someObject: Any = 100 //tipe aslinya insteger
    //coba cast ke String. jika gagal (null), ganti dengan "unknown string"
    val safeString = someObject as? String?: "unknown String"
    println("Hasil cast + fallback: safeString")
} //