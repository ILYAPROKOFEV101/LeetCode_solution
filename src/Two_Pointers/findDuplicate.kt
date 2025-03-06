package Two_Pointers

fun findDuplicate(nums: IntArray): Int {
    // Группируем элементы массива по их значениям
    val frequencyMap = nums.groupBy { it }

    // Находим элемент с максимальным количеством повторений
    val mostFrequent = frequencyMap.maxByOrNull { it.value.size }?.key

    return mostFrequent ?: 0
}