package oop_00000131636_KevinIvanSetiadiPhang.week04.Tugas2

fun main() {
    println("=== TUGAS MANDIRI 2: HIERARKI KARYAWAN (DRY PRINCIPLE) ===\n")

    // Membuat objek Manager
    val manager = Manager(name = "Budi Santoso", baseSalary = 8_000_000)
    println("--- MANAGER ---")
    println("Nama: ${manager.name}")
    println("Gaji Pokok: Rp ${manager.baseSalary}")
    manager.work()
    println("Bonus: Rp ${manager.calculateBonus()}")
    println()

    // Membuat objek Developer
    val developer = Developer(
        name = "Ani Wijaya",
        baseSalary = 7_000_000,
        programmingLanguage = "Kotlin"
    )
    println("--- DEVELOPER ---")
    println("Nama: ${developer.name}")
    println("Gaji Pokok: Rp ${developer.baseSalary}")
    println("Bahasa Pemrograman: ${developer.programmingLanguage}")
    developer.work()
    println("Bonus: Rp ${developer.calculateBonus()}")
    println()

    // Demonstrasi polimorfisme (opsional)
    println("--- DEMO POLIMORFISME ---")
    val karyawan1: Employee = Manager("Dewi", 9_000_000)
    val karyawan2: Employee = Developer("Rudi", 6_000_000, "Java")

    karyawan1.work()
    println("Bonus: Rp ${karyawan1.calculateBonus()}")
    println()

    karyawan2.work()
    println("Bonus: Rp ${karyawan2.calculateBonus()}")
}