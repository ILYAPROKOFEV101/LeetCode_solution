package leetcode75.Easy

fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
   return candies.map { it  + extraCandies >= candies.max()!!  }.toMutableList()

}


fun main(){
    // 5 3 2 2 3
    val arra = intArrayOf(4,2,1,1,2)
    var extraCandies = 1
    println(kidsWithCandies(arra, extraCandies).joinToString { it.toString() })
}
