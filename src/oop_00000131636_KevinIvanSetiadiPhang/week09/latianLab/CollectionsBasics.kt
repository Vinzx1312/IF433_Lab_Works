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
}