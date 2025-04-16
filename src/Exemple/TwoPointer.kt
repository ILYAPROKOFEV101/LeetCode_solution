package Exemple

fun main() {
    val nums = listOf(1, 3, 4, 5, 7, 10, 11)
    val target = 9

    val result = twoPointers(nums, target)

    if (result != null) {
        println("Найдено: индексы ${result.first} и ${result.second} (значения: ${nums[result.first]} + ${nums[result.second]} = $target)")
    } else {
        println("Нет пары, дающей сумму $target")
    }
}

// Функция с реализацией метода двух указателей
fun twoPointers(nums: List<Int>, target: Int): Pair<Int, Int>? {
    var left = 0                   // Левый указатель (начало массива)
    var right = nums.size - 1     // Правый указатель (конец массива)

    while (left < right) {
        val sum = nums[left] + nums[right]

        when {
            sum == target -> {
                // Найдена пара, сумма равна target
                return Pair(left, right)
            }
            sum < target -> {
                // Сумма меньше нужной — сдвигаем левый указатель вправо
                left++
            }
            else -> {
                // Сумма больше нужной — сдвигаем правый указатель влево
                right--
            }
        }
    }

    // Пара не найдена
    return null
}
