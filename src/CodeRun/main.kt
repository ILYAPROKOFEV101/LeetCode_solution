package CodeRun

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter


fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    // Читаем число
    val n = reader.readLine().toInt()

    // Читаем строку
    val text = reader.readLine()

    // Читаем массив чисел
    val nums = reader.readLine().split(" ").map { it.toInt() }


    var weight = Int.MIN_VALUE  // Инициализируем минимальным значением
    var index = -1  // Индекс с максимальной разницей

    for (i in 0 until nums.size - 1) {
        val value = nums[i + 1] - nums[i]
        if (value >= weight) {  // Запоминаем последний максимальный индекс
            weight = value
            index = i + 1  // Теперь сохраняем индекс следующего элемента
        }
    }


    writer.write(text.get(index).toString())




    writer.flush()  // Принудительно записываем данные
    reader.close()
    writer.close()
}