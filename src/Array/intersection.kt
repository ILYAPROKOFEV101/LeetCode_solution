package Array


fun intersection(nums1: IntArray, nums2: IntArray): IntArray {
    val frequencyMap = mutableMapOf<Int, Int>() // Для подсчета частоты элементов в nums1
    val result = mutableListOf<Int>() // Для хранения результата

    // Подсчитываем частоту каждого элемента в nums1
    for (num in nums1) {
        frequencyMap[num] = frequencyMap.getOrDefault(num, 0) + 1
    }

    // Проверяем элементы nums2 и добавляем их в результат, если они есть в frequencyMap
    for (num in nums2) {
        if (frequencyMap.containsKey(num) && frequencyMap[num]!! > 0) {
            result.add(num)
            frequencyMap[num] = frequencyMap[num]!! - 1 // Уменьшаем счетчик
        }
    }

    return result.toIntArray() // Преобразуем список в массив
}