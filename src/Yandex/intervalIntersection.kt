package Yandex

fun intervalIntersection(firstList: Array<IntArray>, secondList: Array<IntArray>): Array<IntArray> {
        val result = mutableListOf<IntArray>()
        var i = 0
        var j = 0

        while (i < firstList.size && j < secondList.size) {
            var a = firstList[i]
            var b = secondList[j]

            var statr = maxOf(a[0], b[0])
            var end  = minOf(a[1], b[1])

            if(statr <= end){
                result.add(intArrayOf(statr, end))
            }


            if(a[1] > b[1]){
                i++
            } else {
                j++
            }


        }

    return result.toTypedArray()

}