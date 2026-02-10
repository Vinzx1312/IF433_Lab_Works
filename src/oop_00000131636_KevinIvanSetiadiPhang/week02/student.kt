package oop_00000131636_KevinIvanSetiadiPhang.week02

class student(
    val name:String,
    val nim:String,
    var major:String
){
    init {
        //validasi sederhana cek panjang NIM
        if (nim.length != 5) {
            println("WARNING :Objek tercipta  dengan NIM ($nim) yang tidak valid")
            println("Data  mahasiswa $name mungkin akan bermasalah di sistem.")
        } else {
            println("LOG: Objek student $name berhasil dialokasikan di Memory.")
        }
    }
        //secondary Constructor
        //wajib memanggil primary Constructor menggunakna "this"
        constructor(name: String, nim: String) : this(name, nim, major="Non-Matriculated") {
            println("LOG: Menggunakan constructor jalur umum ( Tanpa Jurusan).")
        }
    }
    //body class kosong dulu
}