package Array

fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
    val merged = nums1.take(m) + nums2.take(n)
    val sorted = merged.sorted()
    for (i in sorted.indices) {
        nums1[i] = sorted[i]
    }

}

