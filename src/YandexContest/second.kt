package YandexContest

fun main() {
    val k = readLine()?.toIntOrNull() ?: return
    val n = readLine()?.toIntOrNull() ?: return
    val input = readLine()?.trim()?.split(" ")?.mapNotNull { it.toIntOrNull() } ?: return
    if (input.size < n) return

    val numbers = input.take(n)

    // Сохраняем первое появление числа
    val firstIndex = mutableMapOf<Int, Int>()
    numbers.forEachIndexed { index, num ->
        if (num !in firstIndex) {
            firstIndex[num] = index
        }
    }

    // Считаем частоты
    val freqMap = numbers.groupingBy { it }.eachCount()

    // Сортируем: сначала по убыванию частоты, потом по порядку появления
    val sorted = freqMap.entries
        .sortedWith(compareByDescending<Map.Entry<Int, Int>> { it.value }
            .thenBy { firstIndex[it.key] ?: Int.MAX_VALUE })
        .map { it.key }

    // Выводим первые k чисел
    println(sorted.take(k).joinToString(" "))
}


