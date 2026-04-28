package oop_00000131636_KevinIvanSetiadiPhang.week10.Lab

class MathBox<T : Number>(val value1: T, val value2: T) {
    fun sum(): Double {
        return value1.toDouble() + value2.toDouble()
    }
}