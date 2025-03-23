package Array.Midl

fun findDisappearedNumbers(nums: IntArray): List<Int> {
    var solution = mutableListOf<Int>()
    var index = 0

    nums.groupBy { it}
        .filter { it.value.size > 1}
        .keys
        .sorted()


    for( i in  0..nums.size -1 ){
        if(nums[i] > index) solution.add(index)
        index++
    }

    if(solution.isEmpty()) {
        solution.add(index)

    }
    return solution

}

fun main(){
    var arra = intArrayOf(1,1,1,2,2,3)

}
