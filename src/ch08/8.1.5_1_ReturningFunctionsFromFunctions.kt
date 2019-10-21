package ch08.ex1_5_1_ReturningFunctionsFromFunctions

enum class Delivery { STANDARD, EXPEDITED }

class Order(val itemCount: Int)

fun getShippingCostCalculator(
        delivery: Delivery): (Order) -> Double {
    if (delivery == Delivery.EXPEDITED) {
        return { order -> 6 + 2.1 * order.itemCount }
    }

    return { order -> 1.2 * order.itemCount }
}

fun main(args: Array<String>) {
    val getExpeditedPrice = getShippingCostCalculator(Delivery.EXPEDITED)
    val getStandardPrice = getShippingCostCalculator(Delivery.STANDARD)
    println("Shipping costs ${getExpeditedPrice(Order(3))}")
    println("Shipping costs ${getStandardPrice(Order(3))}")
}
