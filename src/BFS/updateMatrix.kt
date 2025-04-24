package BFS

fun updateMatrix(mat: Array<IntArray>): Array<IntArray> {
        val m = mat.size
        val n = mat[0].size

        val result = Array(m) { IntArray(n) { Int.MAX_VALUE} }
        val queue: ArrayDeque<Pair<Int, Int>> = ArrayDeque()

        for( i in 0 until m) {
            for( j in 0 until n) {
                if(mat[i][j] == 0){
                    result[i][j] = 0
                    queue.add(Pair(i, j))
                }
            }
        }


        val direction  = arrayOf(
            Pair(-1, 0),
            Pair(1, 0),
            Pair(0, -1),
            Pair(0, 1),
        )

        while(queue.isNotEmpty()){
            val (i, j) = queue.removeFirst()
            for((di, dj) in direction){
                val ni = i + di
                val nj = j + dj

                if(ni in 0 until m && nj in 0 until n){
                    // если расстояние можно улучшить
                    if (result[ni][nj] > result[i][j] + 1) {
                        result[ni][nj] = result[i][j] + 1
                        queue.add(Pair(ni, nj))
                    }
                }
            }
        }

    return result

}