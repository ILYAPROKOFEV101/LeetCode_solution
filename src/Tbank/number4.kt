package Tbank

import java.util.*

fun main() {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toInt() }
    val maxValue = 10
    val prefix = Array(maxValue + 1) { IntArray(n + 1) { 0 } }
    for (v in 1..maxValue) {
        for (i in 0 until n) {
            prefix[v][i + 1] = prefix[v][i] + if (a[i] == v) 1 else 0
        }
    }

    var total = 0

    for (l in 0 until n) {
        for (r in l until n) {
            val length = r - l + 1
            if (length < 3) continue

            var found = false

            for (j in l + 1 until r) {
                val target = 2 * a[j]

                for (x in 1..maxValue) {
                    val y = target - x
                    if (y < 1 || y > maxValue) continue

                    val leftCount = prefix[x][j] - prefix[x][l]
                    if (leftCount <= 0) continue

                    val rightCount = prefix[y][r + 1] - prefix[y][j + 1]
                    if (rightCount > 0) {
                        found = true
                        break
                    }
                }

                if (found) break
            }

            if (found) {
                total++
            }
        }
    }

    println(total)
}
