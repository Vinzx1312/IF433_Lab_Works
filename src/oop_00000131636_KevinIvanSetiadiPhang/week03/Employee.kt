package oop_00000131636_KevinIvanSetiadiPhang.week03

class Employee(val name: String) {
    var salary: Int = 0
    set(value) {
        println("Mencoba set gaji ke: $value")
        //Peringatan: kode di bawah ini salah dan berbahaya!
        //Kita memanggil setter di dalam setter ( recursive)
        this.salary = value
    }
}
