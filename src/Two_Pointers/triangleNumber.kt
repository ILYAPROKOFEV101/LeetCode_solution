package Two_Pointers

fun triangleNumber(nums: IntArray): Int {
   var count = 0
    nums.sort()


    for( i in 0 until nums.size - 2){
        var k = i + 2
        for( j in i + 1 until nums.size -1 ){
            while( k < nums.size &&  nums[i] + nums[j] > nums[k]){
                k++
            }
            count += k - j - 1
        }
    }
    return count

}

fun main(){
    var intArray = intArrayOf(2,2,3,4)
    println(triangleNumber(intArray))
}

