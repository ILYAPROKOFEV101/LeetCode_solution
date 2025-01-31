package CodeRunimport
import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter



fun main() {
    val reader = System.`in`.bufferedReader()
    val writer = System.out.bufferedWriter()

    // Чтение первой строки: количество вершин (n) и рёбер (m)
    val (n, m) = reader.readLine().split(" ").map { it.toInt() }

    // Инициализация списка смежности (вершины нумеруются с 1 до n)
    val graph = Array(n + 1) { mutableListOf<Int>() }
    val incomingEdges = IntArray(n + 1) { 0 }

    // Чтение рёбер и их добавление в список смежности
    for (i in 1..m) {
        val edge = reader.readLine().split(" ").map { it.toInt() }
        val from = edge[0]
        val to = edge[1]
        if (from != to) {
            graph[from].add(to)
        }
        if (to != from || from == to) {
            incomingEdges[to]++
        }
    }

    // Проверка наличия города Рима
    var romeCity = -1
    for (city in 1..n) {
        if (graph[city].isEmpty() || (graph[city].size == 1 && graph[city][0] == city)) {
            if (incomingEdges[city] == n - 1 + if (graph[city].size == 1 && graph[city][0] == city) 1 else 0) {
                romeCity = city
                break
            }
        }
    }
 

    writer.write("$romeCity\n")
    reader.close()
    writer.flush()
    writer.close()
}