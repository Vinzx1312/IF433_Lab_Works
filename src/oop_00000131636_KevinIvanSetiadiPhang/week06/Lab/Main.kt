package oop_00000131636_KevinIvanSetiadiPhang.week06.Lab

// Fungsi ini Decoupled! Tidak peduli kelas aslinya apa.
fun processCheckout(method: PaymentMethod, amount: Double) {
    println("-> Memulai checkout...")
    method.pay(amount) // Dynamic polymorphism in action
}

fun main() {
    val myWatch = Smartwatch()
    myWatch.showTime()

    val myPhone = Smartphone()
    myPhone.turnOn()

    val pay1 = Gopay()
    val pay2 = CreditCard()

    println("\n=== TESTING CHECKOUT ===")
    processCheckout(method = pay1, amount = 50000.0)
    processCheckout(method = pay2, amount = 150000.0)

    // === SMART HOME SYSTEM ===
    println("\n=== SMART HOME SYSTEM ===")

    // Instansiasi perangkat
    val lamp    = SmartLamp(id = "SL-001", name = "Ruang Tamu")
    val speaker = SmartSpeaker(id = "SS-001", name = "Google Nest Dapur")
    val cctv    = SmartCCTV(id = "SC-001", name = "Ezviz Garasi")

    // Instansiasi SmartHomeHub dan tambahkan semua perangkat
    val hub = SmartHomeHub()
    hub.addDevice(lamp)
    hub.addDevice(speaker)
    hub.addDevice(cctv)

    // Test fungsionalitas Hub
    hub.activateSecurityMode()
    hub.turnOffAllSwitches()
}
//
