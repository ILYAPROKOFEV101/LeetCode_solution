fun main() {
    val n = readLine()!!.toInt()
    val lines = List(n) {
        readLine()!!.split(' ').let { (s, t) -> s.toInt() to t.toInt() }
    }
    println()
    repeat(readLine()!!.toInt()) {
        val (k, x) = readLine()!!.split(' ').map { it.toInt() }
        val (s, t) = lines[k - 1]

        val result = when {
            x <= s -> s
            else -> {
                val delta = x - s
                val steps = (delta + t - 1) / t
                s + steps * t
            }
        }

        println(result) // Каждый результат на новой строке [[4]]
    }
}

