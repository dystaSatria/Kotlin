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

package com.dicoding.exam.latihanopsional4

/**
 *  TODO
 *  Lengkapi fungsi di bawah dengan ketentuan sebagai berikut:
 *  - Fungsi menerima input string dengan panjang karakter 1-100.
 *  - Fungsi harus mengembalikan karakter yang ditengah dari string yang diinput.
 *      - Jika panjang string bernilai genap, maka yang dikembalikan adalah 2 karakter.
 *      - Jika panjang string bernilai ganjil, maka yang dikembalikan adalah 1 karakter.
 */
fun getMiddleCharacters(string: String): String {
    val middleIndex = string.length / 2
    return if (string.length % 2 == 0) {
        string.substring(middleIndex - 1, middleIndex + 1)
    } else {
        string.substring(middleIndex, middleIndex + 1)
    }
}

fun main() {
    println(getMiddleCharacters("dicodingindonesia") == "i")
    println(getMiddleCharacters("dicoding") == "od")
    println(getMiddleCharacters("A") == "A")
}
