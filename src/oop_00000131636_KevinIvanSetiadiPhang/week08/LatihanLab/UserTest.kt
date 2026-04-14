package oop_00000131636_KevinIvanSetiadiPhang.week08.LatihanLab

object DatabaseMock {
    fun finfUser(id: Int): UserProfile? {
        return if (id == 1) UserProfile("TestUser","test@test.com") else null
    }
}

fun runMockitTest() {
    println("\n=== RUNNING UNIT TEST ===")
    val testuser = DatabaseMock.finfUser(1)

    val initial = testuser!!.name.substring(0, 1)


    check(initial == "T") { "Test failed! Initial is wrong."}
    println("Test passed: Intial is T")
}