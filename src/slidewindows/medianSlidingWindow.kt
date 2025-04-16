package slidewindows

fun medianSlidingWindow(nums: IntArray, k: Int): DoubleArray {
    val result = mutableListOf<Double>()

    for (i in 0..nums.size - k) {
        val window = nums.slice(i until i + k).sorted()
        val median = if (k % 2 == 1) {
            window[k / 2].toDouble()
        } else {
            (window[k / 2 - 1].toDouble() + window[k / 2].toDouble()) / 2
        }
        result.add(median)
    }

    return result.toDoubleArray()
}



fun main(){
    val arra = intArrayOf(1,2,3,4,2,3,1,4,2)
    val k = 3
    println(medianSlidingWindow(arra, k). joinToString(separator = ","))
}
