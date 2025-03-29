package Array

fun combinationSum2(candidates: IntArray, target: Int): List<List<Int>> {
    val result = mutableListOf<List<Int>>()
    candidates.sort()
    fun backtrack(start: Int, current: MutableList<Int>, currentSum: Int) {
        if (currentSum == target) {
            result.add(ArrayList(current)) // Добавляем комбинацию в результат
            return
        }
        if (currentSum > target) return // Если сумма больше целевой, выходим

        for (i in start until candidates.size) {
            // Пропускаем дубликаты
            if (i > start && candidates[i] == candidates[i - 1]) continue

            current.add(candidates[i])
            backtrack(i + 1, current, currentSum + candidates[i]) // Рекурсивный вызов
            current.removeAt(current.size - 1) // Убираем последний элемент для других комбинаций
        }
    }
    backtrack(0 , mutableListOf(), 0 )
    return result.distinct()

}

fun main(){
    val arrai = intArrayOf(1, 2,2)
  //  println(subsets(arrai).joinToString("\n"))
}