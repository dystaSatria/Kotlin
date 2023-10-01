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

package com.dicoding.exam.latihan3

/**
 *  TODO
 *  Lengkapi fungsi di bawah ini agar dapat mengembalikkan tipe nilai sesuai dengan
 *  parameter yang dilampirkan. Contohnya seperti berikut:
 *
 *  input: checkType(10)
 *  output: "Yes! it's Integer"
 *
 *  Berikut adalah beberapa tipe nilai yang wajib ada.
 *  • Integer
 *  • String
 *  • Boolean
 *  • Double
 *  • List<String>
 *  • Map<String, String>
 *
 */
fun <T> checkType(args: T): String {
    return when (args) {
        is Int -> "Yes! it's Integer"
        is String -> "Yes! it's String"
        is Boolean -> "Yes! it's Boolean"
        is Double -> "Yes! it's Double"
        is List<*> -> {
            if (args.all { it is Int }) {  // Check if all elements are of type Int
                "Yes! it's List<Int>"
            } else if (args.all { it is String }) {  // Check if all elements are of type String
                "Yes! it's List<String>"
            } else {
                "No, it's not recognized"
            }
        }
        is Map<*, *> -> {
            if (args.isNotEmpty() && args.keys.firstOrNull() is String && args.values.firstOrNull() is String) {
                "Yes! it's Map<String, String>"
            } else {
                "No, it's not recognized"
            }
        }
        else -> "No, it's not recognized"
    }
}

fun main() {
    println(
        """
        '[10, 9, 8 , 6]' is List? ${checkType(listOf(10, 9, 8, 6))}
        'Dicoding Indonesia' is String? ${checkType("Dicoding Indonesia")}
        'True' is Boolean? ${checkType(true)}
        '10.01' is Double? ${checkType(10.01)}
        """.trimIndent()
    )
}


