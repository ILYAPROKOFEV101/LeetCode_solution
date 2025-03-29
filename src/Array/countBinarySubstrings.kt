package Array

fun countBinarySubstrings(s: String): Int {
    var count = 0
    var zero =0
    var one = 0
    for( i in 1 until s.length  -1 ){

        if( s.get(i) == s.get(i +1)) {
            count++
        }

        if( s == "0") zero++ else one++
        if( zero == one) count++

    }
    return count
}

fun main ( ){
    val s = "00110011"
    println(countBinarySubstrings(s))
}