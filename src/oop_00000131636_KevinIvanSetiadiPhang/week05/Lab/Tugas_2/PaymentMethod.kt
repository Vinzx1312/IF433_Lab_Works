package oop_00000131636_KevinIvanSetiadiPhang.week05.Lab.Tugas_2

abstract class PaymentMethod(val accountName: String) {

    abstract fun processPayment(amount: Double)
}