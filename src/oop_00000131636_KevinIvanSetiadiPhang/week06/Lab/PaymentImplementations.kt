package oop_00000131636_KevinIvanSetiadiPhang.week06.Lab

class Gopay : PaymentMethod{
    override fun pay(amount: Double) {
        println("Processing Rp$amount via Gopay Server")}
    }

    class CreditCard : PaymentMethod{
        override fun pay(amount: Double) {
            println("Cantacting Bank for Rp$amount")}
        }
