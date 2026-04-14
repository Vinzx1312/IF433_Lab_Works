package oop_00000131636_KevinIvanSetiadiPhang.week08

class Alamat(val kota: String);
class Mahasiswa(val address:Alamat)

fun main(){
    val mhs1 = Mahasiswa(address = Alamat(kota = "Tangeang"));
    val mhs2 = Mahasiswa(address = Alamat(kota = "null"))

    println("mahasiswa1: ${mhs1.address.kota}")
    println("Mahasiswa2: ${mhs2.address.kota}")

    val tetapAlamat = Alamat("kontol")
    val defaultAlamat = tetapAlamat.kota?.let {
        adrs->"alamatnya adalahhh $adrs"
    } ?:"alamat kamu kosong"
    println("alamatkamu: ${tetapAlamat.kota}")

}