package Two_Pointers

fun reverseString(s: CharArray): Unit {
    var left = 0
    var right = s.size - 1


    while(left < right){
        var temp = s[left]
        s[left] = s[right]
        s[right] = temp
        left++
        right--
    }

}

