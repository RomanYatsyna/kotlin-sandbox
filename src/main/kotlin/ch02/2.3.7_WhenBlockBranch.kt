package ch02

fun evalWithLogging(e: Expr): Int =
        when (e) {
            is Num -> {
                println("num: ${e.value}")
                // Это последнее выражение в блоке, функция вернет его значение, если
                // е имеет тип Num
                e.value
            }
            is Sum -> {
                val left = evalWithLogging(e.left)
                val right = evalWithLogging(e.right)
                println("sum: $left + $right")
                // Функция вернет значение этого выражения, если оно имеет тип Sum
                left + right
            }
            else -> throw IllegalArgumentException("Unknown expression")
        }

fun main(args: Array<String>) {
    println(evalWithLogging(Sum(Sum(Num(1), Num(2)), Num(4))))
}