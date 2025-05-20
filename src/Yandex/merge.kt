package Yandex

fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
    val first = nums1.clone()
    var i = 0
    var j = 0
    var index = 0
    if(m == 0 ) return
    while(i < m || j < n && n > 0  )
    {
        val a = first[i] // верхний
        val b = nums2[j] // нижний

            if (a < b && a > 0) {
                nums1[index] = a
                i++
            } else {
                nums1[index] = b
                j++
            }
        index++
        }

    }

fun main (){
    val arr1 = intArrayOf(1,2,3,0,0,0)
    val arr2 = intArrayOf(2,5,6)

    println( merge(arr1, 3, arr2, 3))
}