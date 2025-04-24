package Exemple

fun main() {
    val s = readLine()!!.trim()
    var res = 0L

    // Обработка групп из '!' символов
    var currentExcl = 0
    for (c in s) {
        if (c == '!') {
            currentExcl++
        } else {
            if (currentExcl >= 2) {
                res += currentExcl * (currentExcl - 1L) / 2
            }
            currentExcl = 0
        }
    }
    if (currentExcl >= 2) {
        res += currentExcl * (currentExcl - 1L) / 2
    }

    // Обработка групп с не '!' символами
    var currentChar: Char? = null
    var startPos = 0
    val n = s.length
    for (i in 0 until n) {
        val c = s[i]
        if (c != '!') {
            if (currentChar == null) {
                currentChar = c
                startPos = i
            } else if (c == currentChar) {
                continue
            } else {
                val length = i - startPos
                if (length >= 2) {
                    res += length * (length - 1L) / 2
                }
                currentChar = c
                startPos = i
            }
        }
    }
    if (currentChar != null) {
        val length = n - startPos
        if (length >= 2) {
            res += length * (length - 1L) / 2
        }
    }

    println(res)
}