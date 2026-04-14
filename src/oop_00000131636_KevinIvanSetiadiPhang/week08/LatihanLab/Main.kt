package oop_00000131636_KevinIvanSetiadiPhang.week08.LatihanLab

fun main() {
    println("===TEST SAFE CALLS & ELVIS ===")
    val emptyOrder = Order(null,null)

    //rantai safe calss yang elegan
    val destinantion = emptyOrder.deliveryDetails?.address?.city?.name ?: "Kota tidak diketahui"
    println("tujuan pengiriman : $destinantion")

    println("\n=== TEST LET BLOCK ===")
    val validOrder = Order(null, 250000)

    val receipt = validOrder.totalPrice.let { price ->
        //blok ini hanya jalan jika totalPrice tidak null
        val tax = price * 0.11
        "transaksi Valid. harga: Rp$price, pajak: Rp$tax"
    } ?: "Transaksi Invalid:Harga Belum di-set!"
    println(receipt)
}