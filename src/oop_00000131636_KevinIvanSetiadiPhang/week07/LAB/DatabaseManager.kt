package oop_00000131636_KevinIvanSetiadiPhang.week07.LAB

object DatabaseManager {
    var connectionStatus: String = "Disconnected"

    fun connect() {
        connectionStatus = "Connected to Server"
        println("Database is ready.")
    }
}