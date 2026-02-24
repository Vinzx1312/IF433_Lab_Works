package oop_00000131636_KevinIvanSetiadiPhang.week04.Tugas2

class Manager(name: String, baseSalary: Int) : Employee(name, baseSalary) {

    override fun work() {
        println("$name sedang memimpin rapat divisi.")
    }

    override fun calculateBonus(): Int {
        // Bonus standar dari parent (10%) + Rp 500.000
        return super.calculateBonus() + 500000
    }
}