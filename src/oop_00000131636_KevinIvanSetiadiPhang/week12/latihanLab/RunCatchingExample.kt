package oop_00000131636_KevinIvanSetiadiPhang.week12.latihanLab

fun main() {
    println("=== TEST RUNCATCHING ===")
    val result: Result<Int> = runCatching {
        "42X".toInt()
    }
}