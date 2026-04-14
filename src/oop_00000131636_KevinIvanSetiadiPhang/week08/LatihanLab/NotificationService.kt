package oop_00000131636_KevinIvanSetiadiPhang.week08.LatihanLab

class NotificationService {
    fun sendEmail(emailAddress: String) {
        println("Mengirim email ke: $emailAddress")
    }

    fun processUser(user: UserProfile) {
        // sendEmail(user.email) // ini akan error

        if (user.email != null) {
            //success via smart cast : compiler tahu 'user.email' pasti tiak null di blok ini
            sendEmail(user.email)
        } else {
            println("User ${user.name} tidak memiliki email.")
        }
    }
}