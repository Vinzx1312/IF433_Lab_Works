package oop_00000131636_KevinIvanSetiadiPhang.week07.LAB

fun main() {
    println("==== TEST SINGLETON ===")
    println("Status ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n === TEST COMPANION OBJECT ===")
    val cLient = NetworkClient.createClient() //instansiasi lewat factory
    cLient.connect()

    println("\n === TEST REGULER CLASS ===")
    val reg1 = RegularUser("Alice", 22)
    val reg2 = RegularUser("Alice", 22)
    println(reg1) // akan mencetka memori hash
    println("Sama? ${reg1 == reg2}") // false
}
