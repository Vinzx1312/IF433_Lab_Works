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
}
