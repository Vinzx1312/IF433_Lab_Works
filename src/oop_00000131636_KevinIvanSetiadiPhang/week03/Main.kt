package oop_00000131636_KevinIvanSetiadiPhang.week03

fun main() {
    val e = Employee("Budi")

    //1. test validasi salary
    e.salary = -1000 // harusnya salary
    e.salary = 5000000
    println("Gaji: ${e.salary}")

    //2. test encapsulation
    e.increasePerformance()
    //e.performancerRating = 5 // coba uncomment. pasti merah (error)

    //3. test computed property
    println("pajak yang harus dibayar : ${e.tax}")

    println("--- Test Error ---")
    e.salary = 5000 // ini akan meledakkan  program anda
}