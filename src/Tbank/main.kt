package Tbank

fun main() {
    val input = readLine()!!  // Читаем строку из входных данных

    // Проверяем все возможные строки после удаления одного символа
    for (i in 0..3) {
        val newString = input.removeRange(i, i + 1)
        if (newString == newString.reversed()) {
            println("YES")
            return
        }
    }
    
    println("NO")
}
