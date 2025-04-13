import java.util.PriorityQueue

fun main() {
    val (n, x, k) = readLine()!!.split(" ").map { it.toInt() }
    val times = readLine()!!.split(" ").map { it.toInt() }

    // Очередь для хранения следующих звонков
    val pq = PriorityQueue<Pair<Int, Int>>(compareBy { it.first })
    val visited = mutableSetOf<Int>()

    // Заполняем очередь начальными звонками
    for (t in times) {
        pq.add(Pair(t, t)) // Pair(время звонка, начальное время будильника)
    }

    var count = 0
    var lastTime = 0

    while (count < k) {
        val (time, origin) = pq.poll()

        // Если это уникальное время — учитываем
        if (time !in visited) {
            visited.add(time)
            count++
            lastTime = time
        }

        // Добавляем следующий звонок этого будильника
        pq.add(Pair(time + x, origin))
    }

    println(lastTime)
}
