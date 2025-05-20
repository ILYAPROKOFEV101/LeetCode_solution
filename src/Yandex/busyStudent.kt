package Yandex

fun busyStudent(startTime: IntArray, endTime: IntArray, queryTime: Int): Int {
        var couter = 0 
        var i = 0 
        var j = 0 


        while(i < startTime.size && j < endTime.size){
            if((startTime[i] <= queryTime) && (endTime[i] >= queryTime)){
                couter++
            }
                i++
                j++
        }
        return couter
    }