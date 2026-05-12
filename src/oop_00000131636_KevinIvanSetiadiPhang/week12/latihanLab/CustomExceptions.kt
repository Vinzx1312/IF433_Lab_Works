package oop_00000131636_KevinIvanSetiadiPhang.week12.latihanLab

class InsufficientFundsException(
    val amount: Double,
    val balance: Double
) : Exception("Attempted $amount, balance: $balance")
