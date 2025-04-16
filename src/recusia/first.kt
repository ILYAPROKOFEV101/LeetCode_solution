package recusia

fun recount(ints: IntArray) : Int{


    if(ints.isEmpty()) return 0

    return 1 + recount(ints.drop(1).toIntArray())
}

fun findMax(ints: IntArray): Int {
    if(ints.size == 1 ) return ints[0]

    val maxOfRest = findMax(ints.drop(1).toIntArray())  // Рекурсивный вызов

    return if (ints[0] > maxOfRest) ints[0] else maxOfRest  // Сравниваем первый элемент с максимумом из остального

}

fun main(){
    val arra = intArrayOf(1,2,3,4,5,6,7,8,9,10, 6 ,7 ,3 , 3, 3, 3, 3)
    println(recount(arra))
    println(findMax(arra))
}
