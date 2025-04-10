package leetcode75.Easy

//1,12,-5,-6,50,3
fun findMaxAverage(nums: IntArray, k: Int): Double {
    var result = mutableListOf<Double>()


    println(nums.size)


    for (i in 0..nums.size - k) {
        val value = nums.slice(i until i + k)  // Правильный срез по индексам
        println("Срез: $value")

        val sum = value.sum().toDouble()  // Приводим сумму к Double для точности
        println("Сумма среза: $sum")

        val avg = sum / k  // Считаем среднее для текущего среза
        println("Среднее для среза: $avg")

        result.add(avg)  // Добавляем среднее в список
    }


   var value = (result.toDoubleArray().sum() / nums.size) * result.size
println("ctvvf резелтов $value")
    val closest = result.minByOrNull { kotlin.math.abs(it - value) }


    return closest ?: Double.NaN


}

fun main(){
    var arr = intArrayOf(0,1,1,3,3)
    println(findMaxAverage(arr,4))
}