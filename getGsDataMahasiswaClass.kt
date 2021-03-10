fun main() {
    var dataMahasiswaGs = GsDataMahasiswa("Ariq", 123456, "TIK")
    var kapital = Kapital("Andre", 654321, "tik")
//    var pengarang = Pengarang("Ariq")

    println("""
        Nama Mahasiswa : ${dataMahasiswaGs.Name}
        NIM Mahasiswa  : ${dataMahasiswaGs.Nim}
        Jurusan        : ${dataMahasiswaGs.Jurusan}
    """.trimIndent())

    println()

    println("""
        Nama Mahasiswa : ${kapital.kapial1}
        NIM Mahasiswa  : ${dataMahasiswaGs.Nim}
        Jurusan        : ${kapital.kapital2}
    """.trimIndent())
//    println(dataMahasiswaGs.Name)
//    dataMahasiswaGs.Name = ""


//    buku.judul=""

//    println(pengarang.name) // sebelum dirubah
//    println(pengarang.kapial) // Sesudah dirubah
}
