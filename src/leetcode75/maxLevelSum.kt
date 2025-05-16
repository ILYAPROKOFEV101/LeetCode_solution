package leetcode75

import HashTable.ListNode
import com.sun.jdi.Value
import java.util.*


class Solution {
    fun maxLevelSum(root: TreeNode?): Int {
        if (root == null) return 0

        val queue: Queue<TreeNode> = LinkedList()
        queue.add(root)

            var maxSum = Int.MIN_VALUE
            var maxLevel = 1
            var currentLevel = 1

        while (queue.isNotEmpty())
        {
            val levelSize = queue.size
            var levelSum = 0

            repeat(levelSize)
            {
                val node = queue.poll()
                levelSum += node.`val`

                if (node.left != null) queue.add(node.left)
                if (node.right != null) queue.add(node.right)
            }

            if (levelSum > maxSum)
            {
                maxSum = levelSum
                maxLevel = currentLevel
            }

            currentLevel++
        }

        return maxLevel
    }
}

