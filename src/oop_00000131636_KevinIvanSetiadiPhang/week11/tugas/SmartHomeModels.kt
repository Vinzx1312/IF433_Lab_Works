package oop_00000131636_KevinIvanSetiadiPhang.week11.tugas

data class SmartDevice(
    var name: String,
    var category: String,
    var isOnline: Boolean = false,
    var powerLoad: Int = 0
)