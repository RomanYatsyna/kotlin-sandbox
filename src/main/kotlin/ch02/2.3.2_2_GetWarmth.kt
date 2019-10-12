package ch02

fun getWarmth(color: Color) = when (color) {
    Color.RED, Color.YELLOW, Color.ORANGE -> "warm"
    Color.GREEN -> "neutral"
    Color.BLUE, Color.INDIGO, Color.VIOLET -> "cold"
}

fun main(args: Array<String>) {
    println(getWarmth(Color.ORANGE))
}