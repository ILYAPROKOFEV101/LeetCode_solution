package offers

fun checkInclusion  (s1: String, s2: String): Boolean {
    if(s1 in s2) return true

    var left = 0
        val size = s1.length
        for(i in size - 1 until s2.length){
            var value = s2.slice(left +1 until i)
            if( s1 == value.reversed()){
                return true
            }
            while(size < (i - left)){
                left++
            }
        }
        return false 
    }

fun main(){
    val arr1 = "ab"
    val arr2 = "eidboaoo"
    println(checkInclusion(arr1, arr2))
}