package oop_00000131636_KevinIvanSetiadiPhang.week01

fun main(){
    val name = "Jogn Thor"
    val score = 80

    // REFACTOR : String template ($name)
    println("Nama: $name, Nilai: $score")

    //dibawah println
    val grade = when (score) {
        in 90..100 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
    println("Grade kamu: $grade")
    //didalam main
    println("Status: ${calculateStatus(score)}")

    //tambahkan diakhir main()
    val studentId: String? = null

    //jika null, gunakan nila default 0
    val idLength = studentId?.length ?: 0

    println("Panjang ID: $idLength")
}
fun calculateStatus(score : Int) = if (score >75) "Lulus" else "Tidak Lulus"