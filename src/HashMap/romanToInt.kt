package HashMap


fun romanToInt(s: String): Int {
    val romanTo: Map<Char, Int> = mapOf(
        'I' to 1,
        'V' to 5,
        'X' to 10,
        'L' to 50,
        'C' to 100,
        'D' to 500,
        'M' to 1000
    )
    var sum = 0
    var last = 0


    for (char in s) {
        val value = romanTo[char] ?: 0 // Если символ не найден, вернуть 0
        if (value > last) {
            sum += value - 2 * last // Вычитаем last, так как уже прибавляли его раньше
        } else {
            sum += value
        }
        last = value
    }

    return sum
}

fun main(){
    println(romanToInt("MCMXCIV"))
}