package BFS

import leetcode75.TreeNode
import java.util.LinkedList
import java.util.Queue

fun sumOfLeftLeaves(root: TreeNode?): Int {
    var sum = 0
    var queue : Queue<TreeNode> = LinkedList()
     queue.add(root)

    while(queue.isNotEmpty()){
        val node = queue.poll()
        if(node.left != null){
            queue.add(node.left)
            if(node.left!!.left == null && node.left!!.right == null){
                sum += node.left!!.`val`
            }
        }
        if(node.right != null){
            queue.add(node.right)
        }
    }
    return sum
}