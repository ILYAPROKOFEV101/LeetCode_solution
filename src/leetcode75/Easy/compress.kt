package leetcode75.Easy

fun compress(chars: CharArray): Int {
    var write =  0
    var read = 0

    while ( read < chars.size) {
        var currantChar = chars[read]
        var count = 0

        while (read < chars.size && chars[read] == currantChar) {
            read++
            count++
        }

        chars[write] = currantChar
        write++



        if (count > 1) {
            for(j in count.toString()){
                chars[write++] = j

            }
        }

    }
     return write
}

fun main(){
    val array = charArrayOf('a','b','b','b','b','b','b','b','b','b','b','b','b')
    println(compress(array))
}
