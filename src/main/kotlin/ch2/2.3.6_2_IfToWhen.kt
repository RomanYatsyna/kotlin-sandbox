package ch2

fun eval(e: Expr): Int =
        when (e) {
            // ветка when проверяет тип аргумента
            is Num ->
                // автоматическое приведение типов
                e.value
            // ветка when проверяет тип аргумента
            is Sum ->
                // автоматическое приведение типов
                eval(e.right) + eval(e.left)
            else -> throw IllegalArgumentException("Unknown expression")
        }

fun main(args: Array<String>) {
    println(eval(Sum(Num(1), Num(2))))
}