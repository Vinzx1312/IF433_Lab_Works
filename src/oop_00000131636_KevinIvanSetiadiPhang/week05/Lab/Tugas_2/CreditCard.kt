package oop_00000131636_KevinIvanSetiadiPhang.week05.Lab.Tugas_2

class CreditCard(
    accountName: String,
    val limit: Double
) : PaymentMethod(accountName) {

    var usedAmount: Double = 0.0

    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("Pembayaran berhasil menggunakan Credit Card.")
            println("Total terpakai: $usedAmount")
        } else {
            println("Transaksi ditolak. Melebihi limit.")
        }
    }
}