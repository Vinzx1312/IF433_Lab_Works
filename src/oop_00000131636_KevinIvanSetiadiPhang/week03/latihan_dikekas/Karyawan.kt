open class Karyawan {
    private var nama: String = "belum ada"
    private var gaji: Int = 0
    protected var namaPacar: String = "Jomblo"

    public var umur:Int = 0
        set(value) {
            if (value<0){
                println("dh mati YAK?");
            } else {
                field = value;
            }
        }
        get (){
            return field
        }

    fun set_nama(namakamu: String) {
        if (namakamu.length == 0) {
            println("ehh gk boleh kosong brooo")
        } else {
            this.nama = namakamu
        }
    }

    fun get_nama(): String {
        return this.nama + " ok"
    }

    fun setGaji(gaji: Int) {
        if (gaji < 0) {
            println("minggir lu miskin")
        } else {
            this.gaji = gaji;
        }
    }

    fun getGaji(): String {
        return this.gaji.toString() + " Minggir lu miskin"
    }
}

class DataPribadi : Karyawan() {
    fun ambil_data_pacar(): String {
        return this.namaPacar;
    }
}

fun main() {
    var kry = Karyawan()
    kry.set_nama("Ucok Sitorus")
    kry.setGaji(-100)

    println("Hai " + kry.get_nama())
    println("Gajimu " + kry.getGaji())

    var dp = DataPribadi()
    println("Nama pacar: " + dp.ambil_data_pacar())
    println("Nama karyawan:" + dp.get_nama() + "umur kamu" +dp.umur);
    dp.umur = -2;
}
