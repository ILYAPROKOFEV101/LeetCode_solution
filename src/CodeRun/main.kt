package CodeRun

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main(args: Array<String>) {
    val reader = BufferedReader(InputStreamReader(System.`in`))
    val writer = BufferedWriter(OutputStreamWriter(System.out))

    // Создаем список для хранения обработанных email-адресов
    val processedEmails = mutableListOf<String>()

    try {
        // Читаем строки из стандартного ввода
        var line: String?
        while (reader.readLine().also { line = it } != null) {
            if (line.isNullOrEmpty()) break // Прекращаем чтение при пустой строке

            // Обрабатываем email
            val processedEmail = processEmail(line!!)
            processedEmails.add(processedEmail)
        }

        // Подсчитываем уникальные email-адреса
        val uniqueEmails = processedEmails.toSet() // Уникальные email-адреса

        // Выводим количество уникальных email-адресов
        writer.write("${uniqueEmails.size}\n")
    } catch (e: Exception) {
        e.printStackTrace()
    } finally {
        // Закрываем потоки
        reader.close()
        writer.close()
    }
}

fun processEmail(email: String): String {
    // Разделяем email на логин и домен по символу '@'
    val parts = email.split("@")
    if (parts.size != 2) return email // Если формат некорректный, возвращаем как есть


    val login = parts[0]
    val domain = parts[1]

    // Удаляем точки и тире из логина
    val cleanedLogin = login.replace(Regex("[.-]"), "")

    // Оставляем только последний домен верхнего уровня
    val domainParts = domain.split(".")
    val topLevelDomain = domainParts.lastOrNull() ?: ""
    val cleanedDomain = if (domainParts.size > 1) "${domainParts[domainParts.size - 2]}.$topLevelDomain" else domain

    // Собираем обработанный email
    return "$cleanedLogin@$cleanedDomain"
}