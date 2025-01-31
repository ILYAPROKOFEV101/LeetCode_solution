package Test

import kotlin.math.floor

fun calculateTarget(input: String): String {
    val lines = input.trim().split("\n")
    val firstLine = lines[0]
    val secondLine = lines[1]

    val (firstNumber, secondNumber) = firstLine.split(" ").map { it.toInt() }
    val numbersArray = secondLine.split(" ").map { it.toInt() }.toIntArray()

    try {
        val sum = numbersArray.sum()
        val average = sum.toDouble() / firstNumber
        val target = floor(average).toInt()
        return "$target"
    } catch (e: IllegalArgumentException) {
        return "Ошибка: ${e.message}\n"
    }
}