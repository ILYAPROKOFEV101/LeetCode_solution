package Exemple

import java.util.*

// Главная функция
fun main() {
    // Граф представлен в виде списка смежности
    val graph = mapOf(
        0 to listOf(1, 2),
        1 to listOf(0, 3),
        2 to listOf(0),
        3 to listOf(1, 4),
        4 to listOf(3)
    )

    val start = 0
    val target = 4

    // Вызов BFS-функции
    val result = bfs(graph, start, target)

    println("Можно ли добраться от $start до $target? ${if (result) "Да" else "Нет"}")
}

// Функция для поиска в ширину (BFS)
fun bfs(graph: Map<Int, List<Int>>, start: Int, target: Int): Boolean {
    // Очередь для обхода графа
    val queue: Queue<Int> = LinkedList()

    // Множество посещённых вершин, чтобы не заходить туда снова
    val visited = mutableSetOf<Int>()

    // Добавляем стартовую вершину в очередь и отмечаем как посещённую
    queue.add(start)
    visited.add(start)

    // Пока есть вершины для обработки
    while (queue.isNotEmpty()) {
        val current = queue.poll() // Берем следующую вершину из очереди

        // Если нашли целевую вершину — возвращаем true
        if (current == target) {
            return true
        }

        // Обходим всех соседей текущей вершины
        for (neighbor in graph[current] ?: emptyList()) {
            if (neighbor !in visited) {
                queue.add(neighbor)      // Добавляем в очередь
                visited.add(neighbor)    // И отмечаем как посещённого
            }
        }
    }

    // Если весь граф обошли и не нашли цель
    return false
}
