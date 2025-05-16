package String

fun isInterleave(s1: String, s2: String, s3: String): Boolean {
    if( s3 ==  setOf(s1 + s2).joinToString("")  && s3.length == s1.length + s2.length) return true
    else return false
}

fun main ( ){
    val s1 = "aabcc"
    val s2 = "dbbca"
    val s3 = "aadbbcbcac"
    println(isInterleave(s1, s2, s3))
}