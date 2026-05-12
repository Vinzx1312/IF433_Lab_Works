package oop_00000131636_KevinIvanSetiadiPhang.week12.latihanLab

fun main() {
    println("=== TEST RUNCATCHING ===")
    val result: Result<Int> = runCatching {
        "42X".toInt()
    }
    // getOrElse: nilai default jika gagal
    val safeValue = result.getOrElse { -1 }
    println("Safe Value (getOrElse): $safeValue")

    // recover: ubah kegagalan jadi sukses
    val recovered = result.recover { 0 }.getOrNull()
    println("Recovered Value: $recovered")

    runCatching {
        "100".toInt()
    }.onSuccess { v ->
        println("Berhasil dikonversi: $v")
    }.onFailure { e ->
        println("Gagal konversi: ${e.message}")
    }
}