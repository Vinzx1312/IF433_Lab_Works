package oop_00000131636_KevinIvanSetiadiPhang.week08.tugasMandiri

fun main() {
    println("=== E-COMMERCE API PARSER PIPELINE ===\n")

    // -------------------------------------------------------
    // Data kotor dari API eksternal (mirip JSON, ada yang rusak)
    // -------------------------------------------------------
    val rawApiData: List<Map<String, Any?>> = listOf(
        // 1. Data lengkap & valid — Electronic
        mapOf("id" to "E01", "name" to "Laptop", "type" to "ELECTRONIC", "warranty" to 24),

        // 2. Data lengkap & valid — Clothing
        mapOf("id" to "C01", "name" to "T-Shirt", "type" to "CLOTHING", "size" to "XL"),

        // 3. Warranty corrupt (bukan Int) → fallback Elvis ke 12
        mapOf("id" to "E02", "name" to "Mouse", "type" to "ELECTRONIC", "warranty" to "Not An Integer"),

        // 4. Missing ID → requireNotNull akan throw IllegalArgumentException
        mapOf("name" to "Ghost Item", "type" to "CLOTHING"),

        // 5. Tipe tidak dikenal → parseProduct return null → di-skip
        mapOf("id" to "X01", "name" to "Unknown", "type" to "FOOD")
    )

    val parser = ApiParser()

    println("--- Memproses ${rawApiData.size} item dari API ---\n")

    for ((index, raw) in rawApiData.withIndex()) {
        println("[${ index + 1 }] Memproses: ${raw["name"] ?: "(no name)"}")

        try {
            // parseProduct bisa throw IllegalArgumentException (field wajib hilang)
            val product: Product? = parser.parseProduct(raw)

            // Gunakan ?.let → blok ini HANYA jalan jika product TIDAK null
            product?.let {
                parser.checkout(it)
            } ?: println("   ⚠️  Tipe produk tidak dikenal — item di-skip.\n")

        } catch (e: IllegalArgumentException) {
            // Data korup: field wajib (id/name) tidak ditemukan
            println("   ❌ Data korup tertangkap: ${e.message}\n")
        }
    }

    println("\n=== PIPELINE SELESAI ===")
}
