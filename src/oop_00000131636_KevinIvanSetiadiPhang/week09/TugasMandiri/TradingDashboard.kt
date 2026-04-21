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
}