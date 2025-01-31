
fun removeElement(nums: IntArray, `val`: Int): Int {
    var k = 0 // Индекс для записи элементов, которые не равны `val`

    for (i in nums.indices) {
        if (nums[i] != `val`) {
            nums[k] = nums[i]
            k++
        }
    }

    return k
}

fun main() {
    val nums = intArrayOf(3, 2, 2, 3)
    val `val` = 3
    val newLength = removeElement(nums, `val`)
    println("New length: $newLength") // Output: New length: 2
    println("Modified array: ${nums.take(newLength).joinToString(", ")}") // Output: Modified array: 2, 2
}