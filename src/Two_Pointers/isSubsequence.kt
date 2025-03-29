package Two_Pointers

fun isSubsequence(s: String, t: String): Boolean {

    var word = ""
    var index = 0
    if(s.length  == 0) return false
    for( i in t ){
        if(s.get(index) == i){
            println("${s.get(index)} и $i")
            word += s.get(index)
            index++
        }
    }
    return word == s

}

fun  main (){
    var  s = "axc"
    var t = "ahbgdc"
    println(isSubsequence(s, t))
}
