package Array

fun getRow(rowIndex: Int): List<Int> {

    val triangle = mutableListOf<List<Int>>()
    for (i in 0 until rowIndex + 1) {
        val row = MutableList(i + 1) { 1 }
        for ( j in 1 until i ) {
            row[j] = triangle[i- 1][j - 1 ] + triangle[i - 1][j]
        }
        triangle.add(row)
    }
        return triangle.get(rowIndex)
}

fun main() {
    val row = 1
    getRow(row).forEach { print("$it ") }
}
