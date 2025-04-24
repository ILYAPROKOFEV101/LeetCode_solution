package school

import java.util.*

fun main() {
    val n = readLine()!!.toInt()
    val arr = readLine()!!.split(' ').map { it.toInt() }.toMutableList()
    val pos = IntArray(n + 1) { 0 }
    for (i in arr.indices) {
        pos[arr[i]] = i
    }
    val swaps = mutableListOf<Pair<Int, Int>>()

    for (x in n downTo 1) {
        val target = n - x + 1 // 1-based target position
        var targetIdx = target - 1 // 0-based
        while (pos[x] != targetIdx) {
            val y = arr[targetIdx]
            if (kotlin.math.abs(x - y) == 1) {
                // Swap x and y
                val xPos = pos[x]
                val yPos = pos[y]
                // Update array
                arr[xPos] = y
                arr[yPos] = x
                // Update pos
                pos[x] = yPos
                pos[y] = xPos
                // Add swap with sorted positions
                val a = xPos + 1
                val b = yPos + 1
                swaps.add(if (a < b) a to b else b to a)
            } else {
                // Determine z
                val z = if (y < x) y + 1 else y - 1
                // Swap y and z
                val yPos = pos[y]
                val zPos = pos[z]
                // Update array
                arr[yPos] = z
                arr[zPos] = y
                // Update pos
                pos[y] = zPos
                pos[z] = yPos
                // Add swap with sorted positions
                val a = yPos + 1
                val b = zPos + 1
                swaps.add(if (a < b) a to b else b to a)
            }
        }
    }

    println(swaps.size)
    swaps.forEach { (a, b) -> println("$a $b") }
}