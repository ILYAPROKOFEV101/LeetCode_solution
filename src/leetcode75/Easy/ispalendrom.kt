package leetcode75.Easy

fun ispalendroid(s : String) : Boolean {
    var left = 0
    var right = s.length - 1

    while(left < right){
        if(s[left] != s[right]) return false
        left++
        right--
    }

    return true
}

fun main( ){
    var str = "шалаш"
            println(ispalendroid(str))
}