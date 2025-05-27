package Steck


//Zigzag Iterator
class ZigzagIterator(v1: List<Int>, v2: List<Int>) {


    val queue = ArrayDeque<Iterator<Int>>()


    init{
        if(v1.isNotEmpty()) queue.add(v1.iterator())
        if(v2.isNotEmpty()) queue.add(v2.iterator())
    }

    fun next() : Int
    {
        val iter =  queue.removeFirst()
        var value =  iter.next()
        if(iter.hasNext()){
            queue.add(iter)
        }

        return value
    }

    fun hasNext() : Boolean {
       return queue.isNotEmpty()
    }


}

fun main() {
    val zigzag = ZigzagIterator(listOf(1, 2), listOf(3, 4, 5, 6))

    while (zigzag.hasNext()) {
        println(zigzag.next())
    }
}

