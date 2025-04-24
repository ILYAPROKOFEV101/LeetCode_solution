package YandexContest.fore

import java.util.*

fun main() {
    val (N, X, K) = readLine()!!.split(' ').map { it.toLong() }
    val t = readLine()!!.split(' ').map { it.toLong() }

    val groups = HashMap<Long, MutableList<Long>>()
    for (ti in t) {
        val r = ti % X
        groups.computeIfAbsent(r) { mutableListOf() }.add(ti)
    }

    val s_r = groups.values.mapNotNull { it.minOrNull() }.toList()
    if (s_r.isEmpty()) {
        println(0)
        return
    }

    val upper = s_r.maxOfOrNull { s -> s + (K - 1) * X } ?: 0L

    var low = s_r.minOrNull()!!
    var high = upper

    while (low < high) {
        val mid = (low + high) / 2
        var total = 0L
        for (s in s_r) {
            if (s > mid) continue
            val cnt = (mid - s) / X + 1
            total += cnt
            if (total >= K) break
        }
        if (total >= K) {
            high = mid
        } else {
            low = mid + 1
        }
    }

    println(low)
}