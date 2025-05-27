package Prime

abstract class SolBase {
    fun rand7(): Int {
        return (1..7).random()
    }
}

class Solution : SolBase() {
    fun rand10(): Int {
        while (true) {
            val row = rand7()
            val col = rand7()

            var index = (row  -1 ) * 7 + col
            if( index <= 40){
                return index % 10 + 1
            }
        }
    }
}
