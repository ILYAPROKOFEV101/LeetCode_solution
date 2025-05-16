package WithGPT

fun factorial(n: Int): Int {
    if (n == 0) return 1            // базовый случай
    return n * factorial(n - 1)     // рекурсивный случай
}

fun canSumToTarget(nums: IntArray, target: Int): Boolean {
    if (target == 0) return true
    if (target < 0) return false
    for (num in nums) {
        if (canSumToTarget(nums, target - num)) return true
    }
    return false
}
