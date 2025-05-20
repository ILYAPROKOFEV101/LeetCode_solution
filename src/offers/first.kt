package offers

fun summaryRanges(nums: IntArray): List<String> {
    val result = mutableListOf<String>() // инециализация рещультата где он булет лижать
    if(nums.isEmpty()) return result // проврка что масисв не пусть

    var start = nums[0] // инецилизируем что star =  превому элементу

    for( i in 1..nums.size) // начинаю этерацию с 2 элемента
    {
        if(i == nums.size || nums[i] != nums[i - 1] + 1){
            val end = nums[ i -1 ] // конец равен
            if(start == end){
                result.add("$start")
            } else {
                result.add("$start->$end")
            }
            if(i < nums.size) start = nums[i]
        }
    }
    return result
}


fun main(){
    val str  = intArrayOf(0,1,2,4,5,7)
    val result = summaryRanges(str)
    println(result)
}
