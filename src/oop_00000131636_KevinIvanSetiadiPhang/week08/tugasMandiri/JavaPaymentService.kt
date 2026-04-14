package oop_00000131636_KevinIvanSetiadiPhang.week08.tugasMandiri


public class JavaPaymentService {
    /**
     * Memproses pembayaran berdasarkan productId.
     * Selalu menghasilkan Transaction ID — tidak pernah null.
     */
    fun processPayment(productId: String): String {
        return "TRX-" + productId + "-SUCCESS"
    }
}