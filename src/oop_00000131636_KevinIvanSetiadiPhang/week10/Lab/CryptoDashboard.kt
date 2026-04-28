package oop_00000131636_KevinIvanSetiadiPhang.week10.Lab

fun main() {
    // Checkpoint 15: Initialize coin repository
    val coinRepo = WalletRepository<Coin>()

    // Checkpoint 16: Populate coin repository dengan minimal 3 koin
    coinRepo.add(Coin("BTC", 0.5))
    coinRepo.add(Coin("ETH", 2.75))
    coinRepo.add(Coin("USDT", 500.0))


    // Checkpoint 17: Wrap repository data into ApiResponse
    val response = ApiResponse("200 OK", coinRepo.getAll())

    // Checkpoint 18: Print dashboard using forEach on generic list
    println("=== CRYPTO DASHBOARD ===")
    println("Status Response: ${response.status}")
    println("Daftar Koin:")
    response.data.forEach { coin ->
        println("  - ${coin.name}: ${coin.balance} unit")
    }

    // Checkpoint 19: Initialize and populate transaction repository
    val txRepo = WalletRepository<Transaction>()
    txRepo.add(Transaction("TX001", 0.1))
    txRepo.add(Transaction("TX002", 1.5))
    txRepo.add(Transaction("TX003", 250.0))

    println("\n=== RIWAYAT TRANSAKSI ===")
    txRepo.getAll().forEach { tx ->
        println("  - ID: ${tx.id}, Jumlah: ${tx.amount}")
    }

    // Checkpoint 19: Initialize and populate transaction repository
    val txRepo = WalletRepository<Transaction>()
    txRepo.add(Transaction("TX001", 0.1))
    txRepo.add(Transaction("TX002", 1.5))
    txRepo.add(Transaction("TX003", 250.0))

    println("\n=== RIWAYAT TRANSAKSI ===")
    txRepo.getAll().forEach { tx ->
        println("  - ID: ${tx.id}, Jumlah: ${tx.amount}")
    }
}