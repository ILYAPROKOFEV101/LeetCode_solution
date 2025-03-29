
fun <K, V> hashMapOf(capacity: Int): HashMap<K, V> {
    return HashMap(capacity) // Создаёт HashMap с указанным размером
}

class Key(private val hash: Int) {
    override fun hashCode() = hash
}
fun main (){
    val map = hashMapOf<Key, Int>(4)
    map.put(Key(1), 1)
    map.put(Key(5), 2)
    map.put(Key(9), 3)
    map.put(Key(17), 4)
    map.put(Key(9), 5)
    map.put(Key(19),14)
    map.put(Key(91), 16)
        println(map.values)
}
