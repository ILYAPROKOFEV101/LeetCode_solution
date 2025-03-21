package Array

// суть в том чтобы элементы убрарть дубликаты после чего обратно добавить х


fun removeDuplicates(nums: IntArray): Int {
  var newnums = nums.distinct()
    for(i in 0..newnums.size-1){
        nums[i] = newnums[i]
    }
    return newnums.size

}

fun main(){
    var array = intArrayOf(1,2,3,4,5, 7 , 8 ,6 , 6 ,6 )
    println(removeDuplicates(array))
}

