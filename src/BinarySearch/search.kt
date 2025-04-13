package BinarySearch

fun search(nums: IntArray, target: Int): Int {


     if( nums.binarySearch(target) >= 0){
        return  nums.binarySearch(target)
    } else {
        return -1
     }
    }


fun main (){
    println(search(intArrayOf(1,2,3,4), -6))
}