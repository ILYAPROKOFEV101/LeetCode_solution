package Yandex

fun rotate(matrix: Array<IntArray>): Unit {
    val n =  matrix.size


// транспонировать
    for( i in 0 until n ){
        for(j in i + 1 until n ){
            var temp = matrix[i][i]
            matrix[i][j] = matrix[j][i]
            matrix[j][i] = temp
        }
    }
 // ревернуть
    for(i in 0 until n ){
        matrix[i].reverse()
    }


}