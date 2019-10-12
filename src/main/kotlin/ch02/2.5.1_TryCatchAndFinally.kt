package ch02

import java.io.BufferedReader
import java.io.InputStreamReader

// Не требуется явно указывать, какое исключение может возбудить функция
fun readNumber(reader: BufferedReader): Int? {
    try {
        val line = Integer.parseInt(reader.readLine())
        return line
    } catch (e: NumberFormatException) {
        return null
    } finally {
        reader.close()
    }
}

fun main(args: Array<String>) {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    println(readNumber(reader))
}