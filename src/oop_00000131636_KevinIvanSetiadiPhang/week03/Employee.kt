package oop_00000131636_KevinIvanSetiadiPhang.week03

class Employee(val name: String) {
    var salary: Int = 0
    set(value) {
        if(value < 0){
            println("ERROR: Gaji tidak boleh negatif! DI-SET KE 0")
            field = 0
        } else {
            field = value // digunakan field untuk assign nilai asli
        }
    }

    //Hanya bisa diakases di file/class ini saja
    private var performanceRating: Int = 3

    fun increasPerformance() {
        performanceRating++
        println("Kinerja $name meningkat! Rating :$performanceRating")
    }

    //kita tidak buat getter untuk performanceRating. jadi data ini benar benar rahasia
    // kecuali kita buat function khusus untuk print
    fun printStatus(){
        println("Karyawan: $name, Rating : $performanceRating")
    }

    //Tax pajak dihitung 10% dari gaji saat ini
    val tax: Double
        get()= salary * 0.1
}
