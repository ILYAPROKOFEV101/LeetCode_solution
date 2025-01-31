package CodeRun

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import kotlin.math.floor
import kotlin.math.roundToInt


fun main(args: Array<String>) {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    // Считываем первые два числа
    val firstLine = reader.readLine()
    val (firstNumber, secondNumber) = firstLine.split(" ").map { it.toInt() }

    // Считываем вторую строку с массивом чисел
    val secondLine = reader.readLine()
    val numbersArray = secondLine.split(" ").map { it.toInt() }.toIntArray()

    // Выводим результаты
    writer.write("Первое число: $firstNumber\n")
    writer.write("Второе число: $secondNumber\n")
    writer.write("Массив чисел: ${numbersArray.joinToString(" ")}\n")

    // Вызываем функцию bedding и выводим её результат
    try {
        // Вычисляем сумму массива
        val sum = numbersArray.sum()
        writer.write("Сумма массива: $sum\n")

        // Вычисляем target как среднее значение суммы массива на количество итераций
        val average = sum.toDouble() / firstNumber
        writer.write("Среднее значение: $average\n")

        // Округляем до ближайшего меньшего целого числа
        val target = floor(average).toInt()
        writer.write("Результат функции target: $target\n")

        // Вызываем функцию bedding и выводим её результат
        val result = bedding(firstNumber, target, numbersArray)
        writer.write("Результат функции bedding: $result\n")
    } catch (e: IllegalArgumentException) {
        writer.write("Ошибка: ${e.message}\n")
    }

    reader.close()
    writer.close()
}

fun bedding(iterations: Int, target: Int, numbersArray: IntArray): Int {
    var sum = 0
    var currentArray = numbersArray
    for (iteration in 1..iterations) {
        if (currentArray.size < 2) {
            println("Итерация $iteration: Новый массив слишком мал для дальнейших операций.")
            break
        }
        val (newArray, pair) = square(target, currentArray)
        sum += pair
        currentArray = newArray
        println("Итерация $iteration: Новый массив: ${currentArray.joinToString(", ")}, Числа: $pair")
    }
    return sum
}

fun square(target: Int, array: IntArray): Pair<IntArray, Int> {
    if (array.isEmpty()) {
        throw IllegalArgumentException("Массив должен содержать хотя бы один элемент")
    }

    var selectedNumber = -1

    // Находим первое число, которое меньше или равно target
    for (number in array) {
        if (number <= target) {
            selectedNumber = number
            break
        }
    }

    // Если не нашли подходящего числа, возвращаем исходный массив и 0
    if (selectedNumber == -1) {
        return Pair(array, 0)
    }

    // Создаем новый массив без найденного числа
    val newArray = array.filter { it != selectedNumber }.toIntArray()

    // Возвращаем новый массив и удаленное число
    return Pair(newArray, selectedNumber)
}

fun binarySearch(arr: IntArray, target: Int): Int {
    var left = 0 // левая часть
    var right = arr.size - 1 // правая часть

    while (left <= right) { // проверяем по ка правя чатсь станит меньши или равна левой
        val mid = left + (right - left) / 2

        // Проверяем средний элемент
        when {
            arr[mid] == target -> return mid  // Найдено!
            arr[mid] < target -> left = mid + 1  // Ищем в правой половине
            else -> right = mid - 1  // Ищем в левой половине
        }
    }

    return -1  // Не найдено
}