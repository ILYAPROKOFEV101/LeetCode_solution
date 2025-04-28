fun main() {
    // Чтение входных данных
    val line1 = readLine()!!.trim().removeSuffix(".").split(", ")
    val line2 = readLine()!!.trim().removeSuffix(".").split(", ")

    // Функция для преобразования строки в множество множеств
    fun toSetOfSets(lines: List<String>): Set<Set<String>> {
        return lines.map { it.split(" ").toSet() }.toSet()
    }

    // Преобразуем обе строки в множества множеств
    val set1 = toSetOfSets(line1)
    val set2 = toSetOfSets(line2)

    // Сравниваем множества
    if (set1 == set2) {
        println("YES")
    } else {
        println("NO")
    }
}