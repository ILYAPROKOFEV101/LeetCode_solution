package Array



    fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
        val fetch = mutableMapOf<Int, Int>()

        for(num in nums1) {
            fetch[num] = fetch.getOrDefault(num, 0) + 1
        }

        val result = mutableListOf<Int>()

        for(num in nums2){
            var count =  fetch.getOrDefault(num, 0)

            if(count > 0 ){
                result.add(num)
                fetch[num] = count - 1
            }
        }

        return result.toIntArray()
    }


fun main(){
    val arr = intArrayOf(1,2,2,1)
    val arr2 = intArrayOf(2,2)
    println(intersect(arr, arr2).contentToString())
}
