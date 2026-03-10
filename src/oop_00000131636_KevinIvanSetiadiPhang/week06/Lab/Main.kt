package oop_00000131636_KevinIvanSetiadiPhang.week06.Lab

//fungsi ini decoupled! tidak peduli kelas aslinya

fun processCheckout(method: PaymentMethod, amount: Double){
    println("-> Memulai checkout...")
    method.pay(amount) // dynamic polymorphism in action
}

fun main () {
    val myWatch = Smartwatch()
    myWatch.showTime()

    val myPhone = Smartphone()
    myPhone.turnOn()

    val pay1 = Gopay()
    val pay2 = CreditCard()

    println("\n=== TESTIG CHECKOUT ===")
    processCheckout(method = pay1, amount = 50000.0)
    processCheckout(method = pay2, amount = 150000.0)
}