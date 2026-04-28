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
}