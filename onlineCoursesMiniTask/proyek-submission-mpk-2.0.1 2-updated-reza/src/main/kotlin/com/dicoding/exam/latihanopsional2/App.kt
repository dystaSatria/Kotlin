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

package com.dicoding.exam.latihanopsional2

/**
 *  TODO
 *  Lengkapi fungsi di bawah dengan ketentuan sebagai berikut:
 *  - Fungsi menerima input Integer dengan panjang digit 2-9.
 *  - Fungsi harus mengembalikan Integer yang merupakan hasil penjumlahan dari angka terkecil dan angka terbesar dari nilai yang diinput.
 */
fun minAndMax(number: Int): Int {
    val numberStr = number.toString()
    val digits = numberStr.map { it.toString().toInt() }
    val minDigit = digits.minOrNull() ?: 0
    val maxDigit = digits.maxOrNull() ?: 0
    return minDigit + maxDigit
}

fun main() {
    println(minAndMax(987234) == 11)
    println(minAndMax(8812334) == 9)
    println(minAndMax(10) == 1)
}

