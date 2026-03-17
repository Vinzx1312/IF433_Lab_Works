package oop_00000131636_KevinIvanSetiadiPhang.week07.lecture

import java.util.concurrent.Executor

sealed class Hasil {
    data class Sukses(val data: String) : Hasil()
    data class Error(val ex: Exception) : Hasil()
    object Loading : Hasil()

    fun handle_response(res:Hasil) {
        when(res) {
            is Sukses -> {println("sukeses lempat data") }
            is Error -> { println("pesan Error ${res.ex}") }
            Loading -> println("sedang ........... Loading")
        }
    }
}