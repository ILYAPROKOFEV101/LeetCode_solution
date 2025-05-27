package leetcode75.Easy

fun isSubsequence(s: String, t: String): Boolean {
    var word = ""

    var i = 0
    var j = 0

    while(i < s.length && j < t.length){
        if(s[i] == t[j]){
            word += s[i]
            i++

        } else {
            j++
        }
    }
    return word == s
}



fun main(){
    var s = "abc"
    var t = "ahbgdc"
    println(isSubsequence(s, t))
}
