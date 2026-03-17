package oop_00000131636_KevinIvanSetiadiPhang.week07.LAB

fun main() {
    println("==== TEST SINGLETON ===")
    println("Status ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n === TEST COMPANION OBJECT ===")
    val cLient = NetworkClient.createClient() //instansiasi lewat factory
    cLient.connect()
}