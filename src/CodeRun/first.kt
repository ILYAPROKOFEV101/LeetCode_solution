package CodeRun

fun main() {

        var n = readLine()!!.toInt()

        val newValues = readLine()!!.split(" ").map { it.toInt() }.sorted()

        val m = readLine()!!.toInt()

        val result = mutableMapOf<Int, Int>()

        val oldValues = List(m) { readLine()!!.toInt() }
// Для каждого старого значения находим ближайшее каноническое значение
    for (num in oldValues) {
        // Бинарный поиск для нахождения ближайшего канонического значения
        val idx = newValues.binarySearch(num)
        val closest = if (idx >= 0) {
            // Если найдено точное совпадение
            newValues[idx]
        } else {
            // Если точного совпадения нет, ищем ближайшее значение
            val insertPoint = -idx - 1
            val left = if (insertPoint > 0) newValues[insertPoint - 1] else Int.MIN_VALUE
            val right = if (insertPoint < newValues.size) newValues[insertPoint] else Int.MAX_VALUE

            // Сравниваем, что ближе: слева или справа
            if (kotlin.math.abs(num - left) <= kotlin.math.abs(num - right)) left else right
        }

        // Добавляем результат в map
        result[num] = closest
    }

    // Выводим результат
    for ((key, value) in result) {
        println(value)
    }
}