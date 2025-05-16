package WithGPT

fun lengthOfLongestSubstring(s: String): Int {
   var data = mutableSetOf<Char>()
    var left = 0
    for(i in 0 until s.length){
        while(s[i] in data){
            data.remove(s[left])
            left++
        }
    }
    return data.size
}




