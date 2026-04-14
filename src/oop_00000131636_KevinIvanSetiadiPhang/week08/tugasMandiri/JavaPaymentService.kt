package oop_00000131636_KevinIvanSetiadiPhang.week08.tugasMandiri


object JavaPaymentService {
    @JvmStatic
    fun processPayment(productId: String): String {
        return "TRX-$productId-SUCCESS"
    }
}
