package BFS

import java.util.LinkedList
import java.util.Queue

fun bfs(start: Int, graph: Map<Int, List<Int>>) {
    val visited = mutableSetOf<Int>()
    val queue: Queue<Int> = LinkedList()

    queue.add(start)
    visited.add(start)

    while (queue.isNotEmpty()) {
        val node = queue.poll() 
        println("Visited $node")

        for (neighbor in graph[node] ?: emptyList()) {
            if (neighbor !in visited) {
                visited.add(neighbor)
                queue.add(neighbor)
            }
        }
    }
}
