package oop_00000131636_KevinIvanSetiadiPhang.week08

class profile_page(val idprofile:String?, val statusOnline:String?){

    fun ganti_foto(filePhoto:String?){
        println("foto kamu ${filePhoto}")
    }
}

fun main () {
    var nama:String? = "Kevin"
    nama = null;
    println("nama kamu $nama")

    val profile = profile_page( idprofile="12345", statusOnline = "Online")
    println("id ${profile.idprofile} statusnya: ${profile.statusOnline}")


    profile.ganti_foto("fotosayabarengmantan.jpg")


}