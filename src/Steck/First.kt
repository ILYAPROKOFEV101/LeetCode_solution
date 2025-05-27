package Steck

class LRUCache(val capacity: Int) {

    var stor = mutableMapOf<Int, Int>()
    var queue = ArrayDeque<Int>()


    fun get(key: Int): Int {
        var value = stor[key]
        if(value != null){
            queue.remove(key)
            queue.addFirst(key)
            return value
        } else {
            return -1
        }
    }

    fun put(key: Int, value: Int) {
        if(stor.size == capacity && !stor.contains(key)){
            var last = queue.last()
            stor.remove(last)
            queue.remove(last)
        }
        stor[key] = value
        queue.remove(key)
        queue.addFirst(key)
    }

}