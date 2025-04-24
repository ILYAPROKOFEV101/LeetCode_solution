package school

fun main() {
    val input = readLine() ?: ""
    println(countBoringIntervals(input))
}

fun countBoringIntervals(plan: String): Long {
    val n = plan.length
    var result = 0L
    var currentGroupStart = 0 // Начало текущей группы

    for (i in 1..n) {
        // Проверяем, можно ли продолжить текущую группу
        if (i == n || (plan[i] != '!' && plan[i - 1] != '!' && plan[i] != plan[i - 1])) {
            // Завершаем текущую группу
            val groupLength = i - currentGroupStart
            if (groupLength >= 2) {
                result += 1 // Учитываем только саму группу как скучную
            }
            currentGroupStart = i // Начинаем новую группу
        }
    }

    return result
}
