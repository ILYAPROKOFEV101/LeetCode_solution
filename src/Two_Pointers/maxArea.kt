package Two_Pointers

fun maxArea(height: IntArray): Int {
    var left = 0
    var right = height.size - 1
    var max_value = 0


    while(left <= right) {

        var border = minOf(height[left], height[right])
        val waigth = right - left
        var value = border * (waigth)

        max_value = maxOf(max_value, value)


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

