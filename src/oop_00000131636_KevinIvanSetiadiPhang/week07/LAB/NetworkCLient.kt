package oop_00000131636_KevinIvanSetiadiPhang.week07.LAB

class NetworkCLient private constructor(val url: String) {
    fun connect() {
        println("Connecting to $url...")
    }
}