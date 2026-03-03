package oop_00000131636_KevinIvanSetiadiPhang.week05.Lab.Tugas_2

fun main() {

    println("===== TEST PAYMENT =====")

    val eWallet = EWallet("Kevin", 50000.0)
    val creditCard = CreditCard("Kevin", 100000.0)

    val methods: List<PaymentMethod> = listOf(eWallet, creditCard)

    for (method in methods) {
        method.processPayment(75000.0)
        println("----------------------")
    }
}