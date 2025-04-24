package leetcode75

fun largestAltitude(gain: IntArray): Int {
        var  currantHight = 0
        var maxhight = 0


    for (change in gain){
        currantHight += change
            if(currantHight > maxhight){
                maxhight = currantHight
            }
    }
    return maxhight
}