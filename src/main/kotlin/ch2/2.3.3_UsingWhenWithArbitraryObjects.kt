package ch2

import ch2.Color.*
fun mix(color1: Color, color2: Color): Color =
        when (setOf(color1, color2)) {
            setOf(RED, YELLOW) -> ORANGE
            setOf(YELLOW, BLUE) -> GREEN
            setOf(BLUE, VIOLET) -> INDIGO
            else -> throw Exception("Dirty color")
        }


fun main(args: Array<String>) {
    println(mix(BLUE, YELLOW))
}