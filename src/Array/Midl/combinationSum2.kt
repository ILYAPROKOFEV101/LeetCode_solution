package Array.Midl

fun combinationSum2(candidates: IntArray, target: Int): List<List<Int>> {
    val result = mutableListOf<List<Int>>()

    fun backtack(start : Int, current : MutableList<Int>){
        if(current.sum() == target) {
            result.add(current)
        }
        for( i in start until current.size){
            current.add(candidates[i])
            backtack(i + 1, current)
            current.removeAt(current.size - 1)
        }

    }
    backtack(0 , mutableListOf())
    return result
}

fun main ( ){
    var array = arrayOf(1, 2 , 3, 4, 5, 6, 7, 8, 9, 10).toIntArray()
    var target = 7
    println(combinationSum2(array, target).joinToString("\n"))
}