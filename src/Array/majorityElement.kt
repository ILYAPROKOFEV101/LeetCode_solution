package Array

fun majorityElement(nums: IntArray): Int {
    if(nums.isEmpty()) return 0

    val frequencyMap = mutableMapOf<Int, Int>()

    for ( num  in nums) {
        frequencyMap[num] = frequencyMap.getOrDefault(num, 0) + 1
    }
    return frequencyMap.maxByOrNull { it.value }!!.key
}


fun main() {
    val nums = intArrayOf(1, 3, 2, 3, 4, 3, 2, 1)

    // Найти число с максимальным количеством повторов
    val mostFrequent = majorityElement(nums)
    println("Число с максимальным количеством повторов: $mostFrequent")

    // Проверка на пустой массив
    val emptyArray = intArrayOf()
    println("Результат для пустого массива: ${majorityElement(emptyArray)}")
}