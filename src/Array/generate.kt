package Array

fun generate(numRows: Int): List<List<Int>> {
    val triangle = mutableListOf<List<Int>>()
    for (i in 0 until numRows) {
        val row = MutableList(i + 1) { 1 }
            for ( j in 1 until i ) {
                row[j] = triangle[i- 1][j - 1 ] + triangle[i - 1][j]
            }
        triangle.add(row)
    }
    return triangle
}





