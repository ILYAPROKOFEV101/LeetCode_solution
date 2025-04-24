package school

fun main() {
    val n = readLine()!!.toInt()
    val s = readLine()!!.trim()
    val a = readLine()!!.split(" ").map { it.toInt() }.toIntArray()
    
    val searchTimes = IntArray(n) { i ->
        if (i == 0) a[i] else a[i] - a[i - 1]
    }
    
    var maxTime = -1
    var resultChar = ' '
    var resultIndex = -1
    
    for (i in searchTimes.indices) {
        val time = searchTimes[i]
        if (time > maxTime || (time == maxTime && i > resultIndex)) {
            maxTime = time
            resultChar = s[i]
            resultIndex = i
        }
    }
    
    println(resultChar)
}