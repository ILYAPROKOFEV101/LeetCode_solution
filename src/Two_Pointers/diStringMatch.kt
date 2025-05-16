package Two_Pointers

fun diStringMatch(s: String): IntArray {
        val n = s.length
        var low = 0 
        var high = n
        var result = intArrayOf(n + 1)

        for(i in s.indices){
            if(s[i] == 'I'){
                result[i] = low
                low++
            } else {
                result[i] = high
                high--
            }
        }

        result[n] = low
        return  result
    }