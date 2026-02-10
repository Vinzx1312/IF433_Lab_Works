package oop_00000131636_KevinIvanSetiadiPhang.week02.Tugas2


import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    println("=== MINI RPG BATTLE ===")

    print("Masukkan nama Hero: ")
    val heroName = scanner.nextLine()

    print("Masukkan Base Damage Hero: ")
    val baseDamage = scanner.nextInt()

    val hero = Hero(heroName, baseDamage)
    var enemyHp = 100

    println("\nHero ${hero.name} siap bertarung!")
    println("Musuh memiliki HP: $enemyHp\n")

    while (hero.isAlive() && enemyHp > 0) {
        println("Menu:")
        println("1. Serang")
        println("2. Kabur")
        print("Pilihan: ")
        val choice = scanner.nextInt()

        if (choice == 1) {
            hero.attack("Musuh")
            enemyHp -= hero.baseDamage
            if (enemyHp < 0) enemyHp = 0
            println("HP Musuh tersisa: $enemyHp")

            if (enemyHp > 0) {
                val enemyDamage = (10..20).random()
                println("Musuh membalas dengan damage $enemyDamage!")
                hero.takeDamage(enemyDamage)
                println("HP Hero tersisa: ${hero.hp}")
            }

            println()

        } else if (choice == 2) {
            println("Hero kabur dari pertarungan!")
            break
        } else {
            println("Pilihan tidak valid!")
        }
    }

    println("=== HASIL PERTARUNGAN ===")
    if (hero.hp > 0 && enemyHp <= 0) {
        println("Hero MENANG!")
    } else if (hero.hp <= 0) {
        println("Musuh MENANG!")
    } else {
        println("Pertarungan dihentikan.")
    }
}
