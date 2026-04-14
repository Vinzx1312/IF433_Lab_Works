package oop_00000131636_KevinIvanSetiadiPhang.week08.tugasMandiri

// Sealed class memastikan semua kemungkinan tipe Product terdefinisi di sini
sealed class Product()

data class Electronic(
    val id: String,
    val name: String,
    val warrantyMonths: Int
) : Product()

data class Clothing(
    val id: String,
    val name: String,
    val size: String
) : Product()