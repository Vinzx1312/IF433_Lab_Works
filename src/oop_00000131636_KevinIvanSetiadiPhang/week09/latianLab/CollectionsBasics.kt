package oop_00000131636_KevinIvanSetiadiPhang.week09.latianLab

fun main(){
    println("=== TEST LIST===")
    //immutab;e list: tidak bisa diubah setelah dibuah
    val frameworks: List<String> = listOf("Kotlin", "java", "c++")
    //framework.add
    println("Immutable List: $frameworks")

    //mutable list: bisa ditambah atau kurang
    val scores: MutableList<Int> = mutableListOf(85,90)
    scores.add(95)
    scores[0] = 88
    println("Mutable List: $scores")


    println("\n=== TEST SET ===")
    val uniqueNumbers = setOf("1", "2", "2", "3", "3", "4")
    println("Unique Numbers (Set): $uniqueNumbers") //duplikaat hilang

    val activeUsers = mutableSetOf("UserA", "UserB")
    activeUsers.add("UserC")
    activeUsers.add("UserD")// diabaikan karena sudah ada
    println("Actie Users: $activeUsers")

    println("\n=== TEST MAP ===")
    val studentGrades = mapOf(
        "Alice" to "A",
        "BOB" to "B",
        "Charlie" to "A" //value boleh duplikat
    )
    println("Nilai Bob: ${studentGrades["bob"]}")

    val inventory = mutableMapOf("Apples" to 50, "Bananas" to 30)
    inventory["Oranges"] = 20
    inventory["Apples"] = 45
    println("Inventory: $inventory")
}