package Test.Graf

import java.io.BufferedReader
import java.io.StringReader
import java.io.StringWriter

class Graph(val n: Int) {
    private val adjacencyList = Array(n + 1) { mutableListOf<Int>() }

    fun addEdge(from: Int, to: Int) {
        adjacencyList[from].add(to)
        adjacencyList[to].add(from)
    }

    fun getDegrees(): List<Int> {
        val degrees = MutableList(n + 1) { 0 }
        for (i in 1..n) {
            degrees[i] = adjacencyList[i].size
        }
        return degrees
    }

    fun findVertexWithMaxDegree(): Int {
        val degrees = getDegrees()
        var maxDegree = 0
        var vertexWithMaxDegree = -1
        for (i in 1..n) {
            if (degrees[i] > maxDegree) {
                maxDegree = degrees[i]
                vertexWithMaxDegree = i
            }
        }
        return if (maxDegree == 0) -1 else vertexWithMaxDegree
    }
}

fun processGraph(input: String): String {
    val reader = BufferedReader(StringReader(input))
    val writer = StringWriter()

    // Чтение первой строки: количество вершин (n) и рёбер (m)
    val (n, m) = reader.readLine()!!.split(" ").map { it.toInt() }

    val graph = Graph(n)

    // Чтение рёбер и их добавление в список смежности
    for (i in 1..m) {
        val edge = reader.readLine()!!.split(" ").map { it.toInt() }
        val from = edge[0]
        val to = edge[1]
        graph.addEdge(from, to)
    }

    // Поиск вершины с максимальной степенью
    val vertexWithMaxDegree = graph.findVertexWithMaxDegree()

    // Проверка наличия вершины с ненулевой степенью
    if (vertexWithMaxDegree == -1) {
        writer.write("-1\n")
    } else {
        writer.write("$vertexWithMaxDegree\n")
    }

    return writer.toString().trim()
}