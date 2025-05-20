package Yandex

fun intervalIntersection(firstList: Array<IntArray>, secondList: Array<IntArray>): Array<IntArray> {
        val result = mutableListOf<IntArray>()

    var i =0
     var j = 0


    while( i < firstList.size && j < secondList.size){
        var a = firstList[i]
        var b = secondList[j]

        var start = maxOf(a[0], b[0])
        var end = minOf(a[1], b[1])

        if(start <= end ){
            result.add(intArrayOf(start, end))
        }

         if(a[i] > b[j]){
             i++
         } else {
             j++
         }
    }
    return result.toTypedArray()
}