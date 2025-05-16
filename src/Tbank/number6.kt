package Tbank

fun main() {
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(' ').map { it.toLong() }
    val sorted = a.sorted()
    val k = n / 2
    val sumUpper = sorted.subList(n - k, n).sum()
    val sumLower = sorted.subList(0, k).sum()
    println(sumUpper - sumLower)
}