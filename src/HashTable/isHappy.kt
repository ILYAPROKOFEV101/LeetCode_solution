package HashTable

fun topKFrequent(nums: IntArray, k: Int): IntArray {

    var data = mutableMapOf<Int, Int>()

    for(num in nums) {
        data[num] = data.getOrDefault(num, 0) + 1
    }

    return data.toList().sortedByDescending { it.second }.take(k).map { it.first }.toIntArray()




}

fun main(){
    var intArray = intArrayOf(1,1,1,2,2,3)
    println(topKFrequent(intArray, 2) .joinToString(" ") )

}