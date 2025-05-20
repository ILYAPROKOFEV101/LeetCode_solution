package Yandex

fun numJewelsInStones(jewels: String, stones: String): Int {
   var  count = 0
    val jewel = jewels.toSet()
        for(i in  0 until stones.length) {
            if(stones[i] in jewel) { // m  O(1)
                count++
            }
        }
    return count
    }