package offers

fun checkInclusion  (s1: String, s2: String): Boolean {
    if(s1.length > s2.length) return false


    var need = IntArray(26)
    var window = IntArray(26)

    for(c in s1){
        need[c - 'a']++
    }

    for(i in s2.indices){
        window[s2[i] - 'a']++
            if(i >= s1.length) {
                window[s2[i - s1.length] - 'a']--
            }
        if(need.contentEquals(window)) return true
    }

return false

    }

fun main(){
    val arr1 = "boa"
    val arr2 = "eidboaoo"
    println(checkInclusion(arr1, arr2))
}