package ch02

import java.io.BufferedReader
import java.io.StringReader

fun readNumber3(reader: BufferedReader) {
    // Если исключение не возникает - будет возвращено это значение
    val number = try {
        Integer.parseInt(reader.readLine())
    } catch (e: NumberFormatException) {
        // Если исключение возникнет, будет возвращено значение null
        null
    }

    println(number)
}

fun main(args: Array<String>) {
    // Возбудит исключение, поэтому функция выведет null
    val reader = BufferedReader(StringReader("not a number"))
    readNumber3(reader)
}