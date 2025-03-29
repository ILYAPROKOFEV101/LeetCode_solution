package Array.Midl

fun minSubArrayLen(target: Int, nums: IntArray): Int {
   var solution = Int.MAX_VALUE
    var sum = 0
    var waight = 0

    for( i in nums.indices){
        sum += nums[i]
        waight++

        while(sum >= target)
        {
            solution = minOf(solution, waight)
            sum -= nums[i - waight + 1] // Убираем первый элемент окна
            waight-- // Уменьшаем вес подмассива
        }
    }

    return if (solution == Int.MAX_VALUE) 0 else solution

}

fun main()
{
    var target = 11
    var array = arrayOf(1,1,1,1,1,1,1,1)
    println("${minSubArrayLen(target,array.toIntArray() )}")
}