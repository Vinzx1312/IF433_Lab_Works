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

    //check 15
    SmartDevice("Ezviz Outdoor", "Camera").apply {
        isOnline = true
        powerLoad = 5
    }.also {
        println("(LOG) Kamera terhubung")
        homeDevices.add(it)
    }


    // CHECKPOINT 16: Konfigurasi AC & Kabel (run)
    val acUnit = run {
        SmartDevice("Daikin Inverter (Kabel 3x2.5)", "HVAC", false, 800)
    }
    homeDevices.add(acUnit)

    // Tambahkan alat pakan peliharaan
    homeDevices.add(SmartDevice("Picolo's Auto Feeder", "Pet Care", true, 10))

    // CHECKPOINT 17: Pencarian Aman dengan let
    println("\n=== DEVICE SEARCH ===")
    val searchResult = homeDevices.find { it.category == "Camera" }
    searchResult?.let {
        println(it.diagnose())
    }

    // CHECKPOINT 18: with untuk Format Summary
    println("\n=== DASHBOARD SUMMARY ===")
    with(homeDevices) {
        println("Total perangkat terdaftar: ${this.size}")
    }

    // CHECKPOINT 19: Kalkulasi Daya dengan run
    val totalPower = homeDevices.run { sumOf { it.powerLoad } }
    println("Total konsumsi daya: $totalPower Watt")