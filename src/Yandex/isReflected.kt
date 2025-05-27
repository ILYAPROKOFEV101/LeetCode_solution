package Yandex

fun isReflected(points: List<Pair<Int, Int>>): Boolean {
    var maxX = Int.MIN_VALUE
    var minX = Int.MAX_VALUE
    val set = mutableSetOf<Pair<Int, Int>>()


    for((x, y ) in points){
        maxX = maxOf(maxX, x)
        minX = minOf(minX, x)
        set.add(Pair(x, y))
    }


    var sum = maxX + minX


    for((x, y ) in set){
        val Mirror = sum -  x
        if(Pair(Mirror, y ) !in set){
            return false
        }
    }
    return true


}

fun main() {
    val testCases = listOf(
        listOf(
            Pair(1, 2), Pair(-1, 2),    // симметричны по оси Y
            Pair(1, -2), Pair(-1, -2)   // симметричны по оси X и Y
        ) to true, // симметрично относительно x=0
        listOf(Pair(1, 1), Pair(-1, 1), Pair(2, 2), Pair(-2, 2)) to true, // симметрия сдвинута
        listOf(Pair(1, 1), Pair(-1, 1), Pair(2, 2)) to false, // нет пары для (2, 2)
        listOf(Pair(0, 0), Pair(0, 0)) to true, // точки совпадают
        listOf(Pair(1, 2), Pair(3, 2), Pair(-1, 2), Pair(-3, 2)) to true, // симметрия относительно x=0
        listOf(Pair(1, 1), Pair(2, 2), Pair(3, 3)) to false // нет симметрии
    )

    for ((index, test) in testCases.withIndex()) {
        val (points, expected) = test
        val result = isReflected(points)
        println("Test #${index + 1}: ${if (result == expected) "PASSED" else "FAILED"}")
    }
}
