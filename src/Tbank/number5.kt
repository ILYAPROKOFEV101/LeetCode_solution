
fun min(a: Int, b: Int): Int = if (a < b) a else b

fun main() {
    val (n, a, b) = readln().split(" ").map { it.toInt() }
    val s = readln()

    var currentBalance = 0
    var numNegativeBalance = 0

    for (char in s) {
        if (char == '(') {
            currentBalance++
        } else {
            currentBalance--
            if (currentBalance < 0) {
                numNegativeBalance++
                currentBalance = -1 // To count only the first time balance goes negative consecutively
            }
        }
    }

    val finalBalance = currentBalance

    val numExcessOpen = if (finalBalance > 0) finalBalance else 0

    val numSwaps = min(numNegativeBalance, numExcessOpen)
    val cost = numSwaps * min(a, 2 * b) + (numNegativeBalance - numSwaps) * b + (numExcessOpen - numSwaps) * b

    println(cost)
}