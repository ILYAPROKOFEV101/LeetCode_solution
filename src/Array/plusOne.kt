package Array

fun plusOne(digits: IntArray): IntArray {
    var carry = 1


    for (i in digits.size - 1 downTo 0) {
        val sum = digits[i] + carry
        digits[i] = sum % 10
        carry = sum / 10
    }


    return if (carry > 0) {
        val result = IntArray(digits.size + 1)
        result[0] = carry
        System.arraycopy(digits, 0, result, 1, digits.size)
        result
    } else {
        digits
    }
}

// Пример использования:
fun main() {
    val input = intArrayOf(1, 2,78 )
    val result = plusOne(input)
    println("Результат: ${result.joinToString(", ")}") // Выведет: Результат: 1, 2, 4
}