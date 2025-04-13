package YandexContest

fun main() {
    // Чтение входной строки
    val input = readLine() ?: ""

    // Построение результирующей строки с заменой каждого 5-го символа
    val result = StringBuilder()

    for (i in input.indices) {
        if ((i + 1) % 5 == 0) {
            // Заменяем каждый 5-й символ на '&'
            result.append('&')
        } else {
            // Оставляем остальные символы без изменений
            result.append(input[i])
        }
    }

    // Вывод результата
    println(result.toString())
}