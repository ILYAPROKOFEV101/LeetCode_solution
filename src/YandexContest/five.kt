package YandexContest


fun isPointInCrater(
    pointX: Int,
    pointY: Int,
    craterX1: Int,
    craterY1: Int,
    craterX2: Int,
    craterY2: Int
): Boolean {
    // Проверяем, что точка находится внутри прямоугольника кратера
    return pointX in craterX1..craterX2 && pointY in craterY1..craterY2
}

fun main() {
    // Считываем первую строку: h, w, n
    val firstLine = readLine()?.trim()?.split(" ")?.mapNotNull { it.toIntOrNull() } ?: return
    if (firstLine.size < 3) return
    val h = firstLine[0] // высота карты
    val w = firstLine[1] // ширина карты
    val n = firstLine[2] // количество кратеров

    // Считываем координаты всех кратеров
    val craters = mutableListOf<Pair<Pair<Int, Int>, Pair<Int, Int>>>() // список границ кратеров
    for (i in 0 until n) {
        val input = readLine()?.trim()?.split(" ")?.mapNotNull { it.toIntOrNull() } ?: return
        if (input.size == 4) {
            val x1 = input[0]
            val y1 = input[1]
            val x2 = input[2]
            val y2 = input[3]
            craters.add(Pair(Pair(x1, y1), Pair(x2, y2)))
        }
    }

    // Считываем количество запросов
    val q = readLine()?.toIntOrNull() ?: return // количество запросов

    // Обрабатываем запросы
    val results = mutableListOf<Int>() // результаты для каждого запроса
    for (i in 0 until q) {
        val pointInput = readLine()?.trim()?.split(" ")?.mapNotNull { it.toIntOrNull() } ?: return
        if (pointInput.size == 2) {
            val pointX = pointInput[0]
            val pointY = pointInput[1]

            // Проверяем, попадает ли точка в любой из кратеров
            var isInsideAnyCrater = false
            for ((craterTopLeft, craterBottomRight) in craters) {
                val craterX1 = craterTopLeft.first
                val craterY1 = craterTopLeft.second
                val craterX2 = craterBottomRight.first
                val craterY2 = craterBottomRight.second

                if (isPointInCrater(pointX, pointY, craterX1, craterY1, craterX2, craterY2)) {
                    isInsideAnyCrater = true
                    break
                }
            }

            // Добавляем результат
            results.add(if (isInsideAnyCrater) 1 else 0)
        }
    }

    // Выводим результаты
    println(results.joinToString(" "))
}