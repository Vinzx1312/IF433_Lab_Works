package oop_00000131636_KevinIvanSetiadiPhang.week11.tugas


fun main() {
    println("========================================")
    println("    SMART HOME CONFIGURATION PIPELINE   ")
    println("========================================")

    // CHECKPOINT 13: Initialize smart home device list
    val homeDevices = mutableListOf<SmartDevice>()

    //check 14
    SmartDevice("Philips WiZ Living Room", "Lighting").apply {
        isOnline = true
        powerLoad = 12
    }.also {
        homeDevices.add(it)
        println("[SETUP] Perangkat pencahayaan ditambahkan: ${it.name}")
    }