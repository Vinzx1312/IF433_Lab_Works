package oop_00000131636_KevinIvanSetiadiPhang.week07.LAB

class NetworkCLient private constructor(val url: String) {
    companion object {
        const val BASE_URL = "https://api.umn.ac.id" // shared constant

        fun createClient(): NetworkCLient {
            println("Membangun NetworkClient dengan Base-URL: $BASE_URL")
            return NetworkCLient(BASE_URL)
        }
    }
    fun connect() {
        println("Connecting to $url...")
    }
}