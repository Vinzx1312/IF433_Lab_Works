package oop_00000131636_KevinIvanSetiadiPhang.week06.Lab

//error:class smarphone inherits multiple implementations of turnOn()
class Smartphone : Camera, Phone {
    //manually override to resolve
    override fun turnOn() {
        super<Camera>.turnOn() // menjalanka logika camera
        super<Phone>.turnOn() // menjalankan logika phone
        println("Sistem operasi Smartphone berhasil booting.")
    }
}
