package oop_00000131636_KevinIvanSetiadiPhang.week08.tugasMandiri

class ApiParser {

    /**
     * Memparsing Map<String, Any?> (representasi JSON kotor) menjadi Product.
     * Menggunakan requireNotNull, as?, dan Elvis (?:) — tanpa satu pun if (x != null).
     *
     * @throws IllegalArgumentException jika field wajib (id / name) tidak ada.
     * @return Product (Electronic/Clothing) atau null jika tipe tidak dikenal.
     */
    fun parseProduct(rawJson: Map<String, Any?>): Product? {

        // --- Ekstrak field WAJIB menggunakan requireNotNull ---
        // Jika id atau name tidak ada / null, langsung throw IllegalArgumentException
        // dengan pesan yang informatif. Caller wajib menangkap exception ini.
        val id: String = requireNotNull(rawJson["id"] as? String) {
            "API Invalid: Missing ID"
        }
        val name: String = requireNotNull(rawJson["name"] as? String) {
            "API Invalid: Missing Name for id=$id"
        }

        // --- Ekstrak type secara aman ---
        val type = rawJson["type"] as? String // null jika key tidak ada atau bukan String

        return when (type) {
            "ELECTRONIC" -> {
                // warranty bisa corrupt (bukan Int), Elvis berikan fallback 12
                val warranty = rawJson["warranty"] as? Int ?: 12
                Electronic(id = id, name = name, warrantyMonths = warranty)
            }
            "CLOTHING" -> {
                // size bisa tidak ada, Elvis berikan fallback "All Size"
                val size = rawJson["size"] as? String ?: "All Size"
                Clothing(id = id, name = name, size = size)
            }
            else -> null // Tipe tidak dikenal atau null → skip
        }
    }

    /**
     * Melakukan checkout produk ke JavaPaymentService.
     * Menggunakan !! karena kita YAKIN JavaPaymentService selalu menghasilkan Transaction ID.
     */
    fun checkout(product: Product) {
        // Ekstrak ID dari sealed class menggunakan when
        val productId = when (product) {
            is Electronic -> product.id
            is Clothing   -> product.id
        }

        // Java Interop: gunakan !! karena kita tahu implementasi Java-nya aman
        val transactionId = JavaPaymentService.processPayment(productId)!!

        println("✅ Checkout berhasil | Product: ${getProductLabel(product)} | TxID: $transactionId")
    }

    // Helper: label ringkas untuk setiap produk
    private fun getProductLabel(product: Product): String = when (product) {
        is Electronic -> "${product.name} (Warranty ${product.warrantyMonths} bulan)"
        is Clothing   -> "${product.name} (Size: ${product.size})"
    }
} //