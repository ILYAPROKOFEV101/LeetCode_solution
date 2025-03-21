fun combinationSum(candidates: IntArray, target: Int): List<List<Int>> {
    val result = mutableListOf<List<Int>>()
    candidates.sort() // Сортируем для оптимизации

    fun backtrack(start: Int, currentCombination: MutableList<Int>, currentSum: Int) {
        // Если текущая сумма равна target, добавляем комбинацию в результат
        if (currentSum == target) {
            result.add(ArrayList(currentCombination))
            return
        }

        // Если текущая сумма превышает target, прекращаем рекурсию
        if (currentSum > target) {
            return
        }

        // Перебираем кандидатов, начиная с индекса start
        for (i in start until candidates.size) {
            val candidate = candidates[i]
            currentCombination.add(candidate) // Добавляем кандидата в текущую комбинацию
            backtrack(i, currentCombination, currentSum + candidate) // Повторяем рекурсивно
            currentCombination.removeAt(currentCombination.size - 1) // Откатываем выбор
        }
    }

    backtrack(0, mutableListOf(), 0)
    return result
}

fun main() {
    val candidates = intArrayOf(2, 3, 6, 7)
    val target = 7

    val combinations = combinationSum(candidates, target)
    println("Комбинации для target = $target:")
    combinations.forEach { println(it) }
}