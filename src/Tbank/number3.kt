package Tbank

fun main() {
    val n = readLine()!!.toInt()
    val list = readLine()!!.split(" ").map { it.toInt() }
    val sortedList = list.sortedDescending()
    val used = mutableSetOf<Int>()

    for (num in sortedList) {
        var current = num
        while (current > 0) {
            if (used.add(current)) {
                break
            }
            current = current shr 1
        }
        if (current == 0) {
            used.add(0)
        }
    }

    println(used.size)
}
