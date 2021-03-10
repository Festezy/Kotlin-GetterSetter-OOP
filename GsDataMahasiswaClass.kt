class GsMahasiswa

class GsDataMahasiswaClass (Name: String, Nim: Int, Jurusan: String) {
    var Name = Name // getter and setter
    var Nim = Nim
    var Jurusan = Jurusan

        get() {
            println("Data Mahasiswa")
            return field
        }
        set(value) {
            println("")

            if (value.isNotBlank()) {
                field = value
            } else {
                println("")
            }
        }
}

class Kapital (val name: String, val nim: Int, val jurusan: String){
    val kapial1: String
        get() = name.toUpperCase()

    val kapital2: String
    get() = jurusan.toUpperCase()
}
