package leetcode75.Easy

//1,0,0,0,1  //
fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
    var flowers = n
    val newflowerbed = flowerbed.copyOf()

    for (i in newflowerbed.indices) {
        if (newflowerbed[i] == 0 &&
            (i == 0 || newflowerbed[i - 1] == 0) &&
            (i == newflowerbed.size - 1 || newflowerbed[i + 1] == 0)
        ) {
            newflowerbed[i] = 1
            flowers--
            if(flowers == 0 ) return true
        }
    }
    return flowers <= 0
}

fun main(){
    var flowerbed = intArrayOf(0,0,1,0,1)
    var n = 1
    println(canPlaceFlowers(flowerbed, n))

}

