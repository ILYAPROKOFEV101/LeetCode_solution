package Array.Midl

fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
    for (row in matrix) {
        for (element in row) {
            if (element == target) {
                return true
            }
        }
    }
    return false
}