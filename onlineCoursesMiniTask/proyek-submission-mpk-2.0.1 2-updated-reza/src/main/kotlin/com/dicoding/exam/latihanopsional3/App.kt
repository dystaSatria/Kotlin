/****************************************************************************************************
 *                               Perhatian                                                          *
 *                                                                                                  *
 *          Agar dapat diperiksa dengan baik, hindari beberapa hal berikut:                         *
 *                                                                                                  *
 *          1. Mengubah kode yang berada di dalam fungsi main()                                     *
 *          2. Mengubah atau menghapus kode yang sudah ada secara default                           *
 *          3. Membuat fungsi baru yang bukan merupakan tugas latihan                               *
 *          4. Mengubah struktur project (menghapus, mengedit, dan memindahkan package)             *
 *                                                                                                  *
 ***************************************************************************************************/

package com.dicoding.exam.latihanopsional3

/**
 *  TODO
 *  Lengkapi fungsi di bawah dengan ketentuan sebagai berikut:
 *  - Fungsi menerima input string dan integer dengan rentang 1-100.
 *  - Fungsi harus mengembalikan string dengan ketentuan:
 *      - Jika string mengandung angka, maka kalikan angka pada string dengan angka yang diinput.
 *        Kemudian gabungkan string yang diinput dengan hasil kali tersebut.
 *      - Jika string tidak mengandung angka, maka gabungkan string yang diinput dengan angka yang dinput.
 */
fun manipulateString(str: String, int: Int): String {
    val stringWithoutLeadingZeros = str.replaceFirst("^0+".toRegex(), "")

    return if (stringWithoutLeadingZeros.any { it.isDigit() }) {
        val numericPart = stringWithoutLeadingZeros.filter { it.isDigit() }
        val result = numericPart.toInt() * int
        stringWithoutLeadingZeros.replace(numericPart, result.toString())
    } else {
        stringWithoutLeadingZeros + int.toString()
    }
}

fun main() {
    println(manipulateString("Dicoding000010", 100) == "Dicoding1000")
    println(manipulateString("dicoding", 99) == "dicoding99")
    println(manipulateString("dicoding123", 10) == "dicoding1230")
}
