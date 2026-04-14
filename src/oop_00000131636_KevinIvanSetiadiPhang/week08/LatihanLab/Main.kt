package oop_00000131636_KevinIvanSetiadiPhang.week08.LatihanLab

fun main() {
    println("===TEST SAFE CALLS & ELVIS ===")
    val emptyOrder = Order(null,null)

    //rantai safe calss yang elegan
    val destinantion = emptyOrder.deliveryDetails?.address?.city?.name ?: "Kota tidak diketahui"
    println("tujuan pengiriman : $destinantion")
}