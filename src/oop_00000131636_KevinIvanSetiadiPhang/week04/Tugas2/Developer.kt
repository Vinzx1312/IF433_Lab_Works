package oop_00000131636_KevinIvanSetiadiPhang.week04.Tugas2

class Developer(name: String, baseSalary: Int, val programmingLanguage: String) : Employee(name, baseSalary) {

    override fun work() {
        println("$name sedang ngoding menggunakan $programmingLanguage.")
    }

    // calculateBonus() tidak di-override, menggunakan implementasi dari Employee
    // (bonus 10% dari baseSalary)
}