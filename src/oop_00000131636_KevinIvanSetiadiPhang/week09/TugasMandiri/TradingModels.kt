package oop_00000131636_KevinIvanSetiadiPhang.week09.TugasMandiri

data class TradeLog(
    val pair: String,       // Contoh: "BTCUSDT", "ETHUSDT"
    val position: String,  // "LONG" atau "SHORT"
    val leverage: Int,     // Contoh: 10, 20, 50
    val roe: Double,        // Return on Equity dalam %, bisa negatif
    val status: String     // "OPEN" atau "CLOSED"
)