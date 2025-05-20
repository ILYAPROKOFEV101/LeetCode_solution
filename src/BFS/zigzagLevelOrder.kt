package BFS

import java.util.LinkedList
import java.util.Queue

class TreeNoder(var `val`: Int) {
        var left: TreeNode? = null
         var right: TreeNode? = null
    }

fun zigzagLevelOrder(root: TreeNoder?): List<List<Int>> {
    val result = mutableListOf<List<Int>>()

    val queue: Queue<TreeNoder> = LinkedList()
    queue.add(root)

    while (queue.isNotEmpty()) {
        val levelSize = queue.size
        val level = mutableListOf<Int>()
        repeat(levelSize) {
            val node = queue.poll()
            if (node != null) {
                level.add(node.`val`)
            }

            if (levelSize % 2 == 0) {
                result.add(level.reversed())
            } else {
                result.add(level)
            }
        }
    }

    return result
}