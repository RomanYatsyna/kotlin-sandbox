package ch02

import java.util.*

fun main(args: Array<String>) {
    // Словарь TreeMap хранит ключи в порядке сортировки
    val binaryReps = TreeMap<Char, String>()

    // Обход диапазона символов от A до F
    for (c in 'A'..'F') {
        // Преобразует ASCII-код в двоичное представление
        val binary = Integer.toBinaryString(c.toInt())
        // Сохраняет в словаре значение с ключом с
        binaryReps[c] = binary
    }

    // Обход элементов словаря; ключ и значкение присваиваются 2м переменным
    for ((letter, binary) in binaryReps) {
        println("$letter = $binary")
    }

    val list = arrayListOf(10, 11, 1001)
    for ((index, element) in list.withIndex()) {
        println("$index - $element" )
    }
}

