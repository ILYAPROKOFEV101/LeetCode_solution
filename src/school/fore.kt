fun countBoringIntervals(plan: String): Long {
    var boringCount = 0L
    var currentGroupLength = 1 // Длина текущей группы

    for (i in 1 until plan.length) {
        val prevChar = plan[i - 1]
        val currChar = plan[i]

        if (currChar == '!' || prevChar == '!' || currChar == prevChar) {
            // Текущий символ продолжает текущую группу
            currentGroupLength++
        } else {
            // Завершаем текущую группу и считаем скучные отрезки
            boringCount += (currentGroupLength.toLong() * (currentGroupLength - 1)) / 2
            currentGroupLength = 1 // Начинаем новую группу
        }
    }

    // Учитываем последнюю группу
    boringCount += (currentGroupLength.toLong() * (currentGroupLength - 1)) / 2

    return boringCount
}

fun main() {
    val input = readLine() ?: ""
    println(countBoringIntervals(input))
}