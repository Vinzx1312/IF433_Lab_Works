package oop_00000131636_KevinIvanSetiadiPhang.week08.LatihanLab

//nama adalah non null, email dan nnomor telp itu adalah nullable
class UserProfile(
    val name:String,
    val email:String?,
    val phone:String? = null // default argument null
)