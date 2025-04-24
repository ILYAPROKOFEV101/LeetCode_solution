@file:Suppress("NON_TAIL_RECURSIVE_CALL")

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock


class Key(private val hash: Int) {
    override fun hashCode() = hash
}

fun main() {
    val map = HashMap<Key, Int>(4)
    map.put(Key(1), 1)
    map.put(Key(5), 2)
    map.put(Key(9), 3)
    map.put(Key(17), 4)
}