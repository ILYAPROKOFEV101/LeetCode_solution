fun main() {
    val MOD = 998244353

    // Чтение входных данных
    val n = readLine()!!.toInt()
    val a = readLine()!!.split(" ").map { it.toInt() }

    // Максимальное значение b_i ограничено 10^6
    val MAX_B = 1_000_000
    val dp = Array(n + 1) { LongArray(MAX_B + 1) { 0 } }

    // Базовое состояние: dp[1][j] = j
    for (j in 1..MAX_B) {
        dp[1][j] = j.toLong()
    }

    // Динамическое программирование
    for (i in 2..n) {
        for (j in 1..MAX_B) {
            if (dp[i - 1][j] == 0L) continue
            val ai = a[i - 2]
            var k = j * ai
            while (k <= MAX_B) {
                dp[i][k] = (dp[i][k] + dp[i - 1][j] * k % MOD) % MOD
                k += j
            }
        }
    }

    // Суммирование результатов
    var answer = 0L
    for (j in 1..MAX_B) {
        answer = (answer + dp[n][j]) % MOD
    }

    // Вывод ответа
    println(answer)
}