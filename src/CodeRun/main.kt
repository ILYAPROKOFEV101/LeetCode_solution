package CodeRun

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    // Быстрый ввод-вывод
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    try {
        // Читаем первое число
        val number = reader.readLine().toInt()

        // Читаем строку с символами
        val string = reader.readLine()

        // Читаем массив чисел
        val numbers = reader.readLine().split(" ").map { it.toInt() }

        // Пример обработки данных: сумма всех чисел (первого числа и массива)
        val sum = number + numbers.sum()

        // Выводим результат
        writer.write(sum.toString())
        writer.newLine() // Добавляем новую строку для чистоты вывода

        // Закрываем потоки
        writer.flush()
    } finally {
        reader.close()
        writer.close()
    }
}