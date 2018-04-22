package ch2

interface Expr

class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

//fun eval(e: Expr): Int {
//    if (e is Num) {
//        // явное приведение к типу
//        val n = e as Num
//        return n.value
//    }
//    if (e is Sum) {
//        // переменная уже приведена к нужному типу
//        return eval(e.left) + eval(e.right)
//    }
//    throw IllegalArgumentException("Unknown expression")
//}
//
//fun main(args: Array<String>) {
//    println(eval(Sum(Sum(Num(1), Num(2)), Num(4))))
//}