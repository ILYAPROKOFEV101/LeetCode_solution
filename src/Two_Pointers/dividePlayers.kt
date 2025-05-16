package Two_Pointers

fun dividePlayers(skill: IntArray): Long {
    skill.sort()
    var n = skill.size

    val sum = skill.sum() / n

    if( n % 2 != 0 && sum != skill[n / 2]) return -1
    var left = 0
    var right = n - 1
    var result = mutableListOf<Pair<Int, Int>>()



    while(left < right){
        var value = skill[left] + skill[right]
        if(value == sum){
            result.add(Pair(skill[left], skill[right]))
            left++
            right--
        } else {
            right --
        }
    }
    var final = 0
    for( i in result){
        final +=(i.first * i.second)
    }
    return final.toLong()
}

fun main(){
    val skill = intArrayOf(3,2,5,1,3,4)
    val result = dividePlayers(skill)
    println(result)
}