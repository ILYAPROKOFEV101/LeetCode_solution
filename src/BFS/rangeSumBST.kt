package BFS

import leetcode75.TreeNode
import java.util.*

fun rangeSumBST(root: TreeNode?, low: Int, high: Int): Int {
         var count = 0
         var queue : Queue<TreeNode> = LinkedList()
            queue.add(root)

         while(queue.isNotEmpty()){
            var node = queue.poll()

             if(node.`val` >= low && node.`val` <= high){
                 count += node.`val`
             }
             if(node.left != null){
                 queue.add(node.left)
             }
             if(node.right != null){
                 queue.add(node.right)
             }
            
         }
        return count
    }