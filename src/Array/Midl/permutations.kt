package Array.Midl

fun permute(nums: IntArray): List<List<Int>> {
    if (nums.size == 1) return listOf(nums.toList())

    val result = mutableListOf<List<Int>>()
    for (i in nums.indices) {
        val element = nums[i]
        val remaining = nums.filterIndexed { index, _ -> index != i }
        for (perm in permute(remaining.toIntArray())) {
            result.add(listOf(element) + perm)
        }
    }
    return result
}

fun main() {
    val nums = intArrayOf(1, 2, 3)
    val result = permute(nums)
    println(result)
}
