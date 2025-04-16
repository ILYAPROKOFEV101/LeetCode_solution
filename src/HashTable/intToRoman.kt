package HashTable

//3749
// 3000
// 700
// 40
// 9


fun intToRoman(num: Int): String {
    val romanMap = listOf(
        1000 to "M",
        900 to "CM",
        500 to "D",
        400 to "CD",
        100 to "C",
        90 to "XC",
        50 to "L",
        40 to "XL",
        10 to "X",
        9 to "IX",
        5 to "V",
        4 to "IV",
        1 to "I"
    )

    var number = num
    val result = StringBuilder()

    for ((value, symbol) in romanMap) {
        while (number >= value) {
            result.append(symbol)
            number -= value
        }
    }

    return result.toString()
}


fun main(){
    val sum = "LVIII"
    val resulr = 3749
    println(intToRoman(resulr))
}