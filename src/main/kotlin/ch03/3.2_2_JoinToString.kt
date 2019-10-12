package ch03

fun <T> joinToString(
        collection: Collection<T>,
        // Параметры со значениями по-умолчанию
        separator: String = ", ",
        prefix: String = "",
        postfix: String = ""
): String {
    val result = StringBuilder(prefix)

    for ((index, element) in collection.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }
    result.append(postfix)
    return result.toString()
}

fun main(args: Array<String>) {
    val list = listOf(1, 2, 3)
    println(joinToString(list, "; ", "(", ")"))
    // При использовании именованных аргументов можно опустить аргументы из середины списка
    // или вообще указать их в любом порядке
    println(joinToString(prefix = "list: ", collection = list, postfix = " # the end"))
}