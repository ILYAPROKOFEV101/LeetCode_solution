package LinkedList

import java.util.Stack

/* <<<<<<<<<<<<<<  ✨ Windsurf Command 🌟 >>>>>>>>>>>>>>>> */
    fun isValid(s: String): Boolean {
        val map = mapOf(
            '(' to ')',
            '[' to ']',
            '{' to '}'
        )

        val queue = Stack<Char>()

        for (i in s) {
            if (map.containsValue(i)) {
                queue.addLast(i)
            } else if (queue.isEmpty() || queue.last() != map[i]) {
                return false
            } else {
                queue.removeLast()
            }
        }
        return queue.isEmpty()
    }

