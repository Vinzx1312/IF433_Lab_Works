package oop_00000131636_KevinIvanSetiadiPhang.week09.TugasMandiri

fun main() {

    // ─────────────────────────────────────────────
    // CHECKPOINT 11: Inisialisasi Data Uji
    // ─────────────────────────────────────────────
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),
        TradeLog("BTCUSDT", "SHORT", 10, -3.2, "CLOSED"),
        TradeLog("ETHUSDT", "LONG", 15, 8.7, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10, -5.2, "CLOSED"),
        TradeLog("SOLUSDT", "LONG", 50, 22.0, "CLOSED"),
        TradeLog("SOLUSDT", "SHORT", 25, -12.0, "CLOSED"),
        TradeLog("BTCUSDT", "LONG", 20, 6.3, "OPEN"),   // masih terbuka
        TradeLog("ETHUSDT", "SHORT", 30, -1.5, "OPEN")    // masih terbuka
    )
    // ─────────────────────────────────────────────
    // CHECKPOINT 12: Pipeline 1 — Filter CLOSED
    // ─────────────────────────────────────────────
    val closedTrades = tradeHistory
        .filter { it.status == "CLOSED" }


    // ─────────────────────────────────────────────
    // CHECKPOINT 13: Pipeline 2 — Winning Trades
    // ─────────────────────────────────────────────
    val winningTrades = closedTrades
        .filter { it.roe > 0 }

    // ─────────────────────────────────────────────
    // CHECKPOINT 14: Pipeline 3 — Losing Trades
    // ─────────────────────────────────────────────
    val losingTrades = closedTrades
        .filter { it.roe <= 0 }

    // ─────────────────────────────────────────────
    // CHECKPOINT 15: Pipeline 4 — Top Performers
    // Urutkan dari ROE tertinggi, lalu format ke String
    // ─────────────────────────────────────────────
    val topPerformersString = winningTrades
        .sortedByDescending { it.roe }
        .map { "WIN [${it.pair} - ${it.position}]: +${it.roe}% ROE (Lev: ${it.leverage}x)" }
// ─────────────────────────────────────────────
    // CHECKPOINT 16: Pipeline 5 — Worst Performers
    // Urutkan dari ROE terkecil (minus terbesar), lalu format ke String
    // ─────────────────────────────────────────────
    val worstPerformersString = losingTrades
        .sortedBy { it.roe }
        .map { "LOSS [${it.pair} - ${it.position}]: ${it.roe}% ROE (Lev: ${it.leverage}x)" }

    // ─────────────────────────────────────────────
    // CHECKPOINT 17: Pipeline Tambahan — Unique Pairs
    // ─────────────────────────────────────────────
    val uniquePairs = tradeHistory
        .map { it.pair }
        .toSet()

    // ─────────────────────────────────────────────
    // CHECKPOINT 18 & 19: Tampilkan Dashboard
    // ─────────────────────────────────────────────
    println("=== CRYPTO TRADING DASHBOARD ===")

    println("\n--- TOP PERFORMERS (WIN) ---")
    topPerformersString.forEach { println(it) }

    println("\n--- WORST PERFORMERS (LOSS) ---")
    worstPerformersString.forEach { println(it) }

    println("\n--- UNIQUE TRADING PAIRS ---")
    println(uniquePairs)

    // ─────────────────────────────────────────────
    // CHECKPOINT 20: Statistik Tambahan doang
    // ─────────────────────────────────────────────
    val totalClosed = closedTrades.size
    val totalWin    = winningTrades.size
    val winRate     = if (totalClosed > 0) (totalWin.toDouble() / totalClosed * 100) else 0.0

    println("\n--- SUMMARY ---")
    println("Total Closed Trades : $totalClosed")
    println("Win                 : $totalWin")
    println("Loss                : ${losingTrades.size}")
    println("Win Rate            : ${"%.1f".format(winRate)}%")

}