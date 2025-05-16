package leetcode75

import java.util.*


class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

fun rightSideView(root: TreeNode?): List<Int> {
    val result = mutableListOf<Int>()
    if (root == null) return result

    val queue: Queue<TreeNode> = LinkedList()
    queue.add(root)

    while (queue.isNotEmpty()) {
        val levelSize = queue.size

        for (i in 0 until levelSize) {
            val currentNode = queue.poll()

            if (currentNode.left != null) {
                queue.add(currentNode.left)
            }
            if (currentNode.right != null) {
                queue.add(currentNode.right)
            }

            if (i == levelSize - 1) {
                result.add(currentNode.`val`)
            }
        }
    }

    return result
}