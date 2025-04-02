package leetcode75.Easy

fun reverseVowels(s: String): String {

    var vowelList = mutableListOf<Char>()
    val vowels = setOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')  // Гласные


    for(char in s) {
        if( char in vowels ) {
            vowelList.add(char)
        }

    }


    vowelList.reverse()


    val result = StringBuilder(s)  // Делаем строку изменяемой
    var vowelIndex = 0  // Указатель на текущую гласную из перевернутого списка


    for (i in s.indices) {
        if (s[i] in vowels) {
            result.setCharAt(i, vowelList[vowelIndex])  // Меняем символ
            vowelIndex++  // Переходим к следующей гласной
        }
    }

    return result.toString()


}


fun main ( ){
    val word = "IceCreAm"
    println(reverseVowels(word))
}