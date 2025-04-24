package school

fun main() {
    val (K, Z) = readLine()!!.split(' ').map { it.toInt() }

    val w = readLine()!!.toInt()
    val whites = mutableSetOf<Pair<Int, Int>>()
    repeat(w) {
        val (i, j) = readLine()!!.split(' ').map { it.toInt() }
        whites.add(Pair(i, j))
    }

    val b = readLine()!!.toInt()
    val blacks = mutableSetOf<Pair<Int, Int>>()
    repeat(b) {
        val (i, j) = readLine()!!.split(' ').map { it.toInt() }
        blacks.add(Pair(i, j))
    }

    val turn = readLine()!!.trim()

    val currentUnits = if (turn == "white") whites else blacks
    val opponent = if (turn == "white") blacks else whites

    val directions = listOf(Pair(1, 1), Pair(1, -1), Pair(-1, 1), Pair(-1, -1))

    var found = false
    loop@ for (unit in currentUnits) {
        val (i, j) = unit
        for (dir in directions) {
            val (dx, dy) = dir
            val ni = i + dx
            val nj = j + dy
            if (ni in 1..K && nj in 1..Z && opponent.contains(Pair(ni, nj))) {
                val nni = i + 2 * dx
                val nnj = j + 2 * dy
                if (nni in 1..K && nnj in 1..Z && !whites.contains(Pair(nni, nnj)) && !blacks.contains(Pair(nni, nnj))) {
                    found = true
                    break@loop
                }
            }
        }
    }

    println(if (found) "Yes" else "No")
}