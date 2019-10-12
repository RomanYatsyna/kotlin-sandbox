package ch02

fun main(args: Array<String>) {
    if (args.size > 0) {
        println("Hello, ${args[0]}!")
    }

    println("Hello ${if (args.size>0) args[0] else "someone"}!")
}