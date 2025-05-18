package BFS

import leetcode75.TreeNode
import java.util.*

fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
    if(p == null ) return false
    if(q == null ) return false

    val queue_p : Queue<TreeNode> = LinkedList()
    var queue_q : Queue<TreeNode> = LinkedList()
    queue_p.add(p)
    queue_q.add(q)

    while(queue_p.isNotEmpty() && queue_q.isNotEmpty()){


          val node_p = queue_p.poll()
          val node_q = queue_q.poll()

          if(node_q == null && node_p == null) {
              continue
          }

        if(node_q == null || node_p == null || node_p.`val` != node_q.`val`) return false
}
    return true
}