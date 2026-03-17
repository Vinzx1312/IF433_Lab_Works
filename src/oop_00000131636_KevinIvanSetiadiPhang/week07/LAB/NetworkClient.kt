package oop_00000131636_KevinIvanSetiadiPhang.week07.LAB

class NetworkClient private constructor(val url: String) {
    companion object {
        const val BASE_URL = "https://api.umn.ac.id" // shared constant

        fun createClient(): NetworkClient {
            println("Membangun NetworkClient dengan Base-URL: $BASE_URL")
            return NetworkClient(BASE_URL)
        }
    }
    fun connect() {
        println("Connecting to $url...")
    }
}