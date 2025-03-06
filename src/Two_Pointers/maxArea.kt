package Two_Pointers

fun maxArea(height: IntArray): Int {
    var max_value = 0


    var left = 0
    var right = height.size - 1

    while(left < right) {
        var  value = 0
        if(height[left] <= height[right] ) {
            var dist = right - left
           value =  height[left] * dist
        } else {
            var dist = right - left
            value = height[right] * dist
        }

        if( max_value <= value ) {
            max_value = value
        }

        // Перемещаем указатель с меньшей высотой
        if (height[left] <= height[right]) {
            left++
        } else {
            right--
        }

    }


    return max_value

}


fun main (){

    var arrays = intArrayOf(1, 8 , 6, 2, 5 , 4, 8 , 3 , 7)

    println(maxArea(arrays))

}

