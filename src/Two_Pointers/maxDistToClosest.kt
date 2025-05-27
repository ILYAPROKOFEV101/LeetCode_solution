package Two_Pointers

fun maxDistToClosest(seats: IntArray): Int {
    var maxDist = 0          // максимальная дистанция
    var lastOccupied = -1    // индекс последнего занятого места

    for (i in seats.indices) {
        if (seats[i] == 1) {
            if (lastOccupied == -1) {
                // Первый человек: расстояние от начала до него
                maxDist = i
            } else {
                // Между двумя занятыми местами
                val dist = (i - lastOccupied) / 2
                maxDist = maxOf(maxDist, dist)
            }
            lastOccupied = i
        }
    }

    // Проверяем, есть ли пустые места в конце
    if (seats[seats.lastIndex] == 0) {
        val dist = seats.size - 1 - lastOccupied
        maxDist = maxOf(maxDist, dist)
    }

    return maxDist
}

fun main(){
    val arra = intArrayOf(1, 0, 0, 0, 1, 0, 1)
    println(maxDistToClosest(arra))
}