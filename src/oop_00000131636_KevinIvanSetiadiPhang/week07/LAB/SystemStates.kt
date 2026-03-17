package oop_00000131636_KevinIvanSetiadiPhang.week07.LAB

enum class AppState {
    STARTING, RUNNING, STOPPED

    sealed class ApiResponse {
        data class Success(val data: String) : ApiResponse()
        data class Error(val error: String) : ApiResponse()
        object Loading : ApiResponse()
    }
}