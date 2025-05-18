import leetcode75.TreeNode
import java.util.*

fun levelOrder(root: TreeNode?): List<List<Int>> {
    val result = mutableListOf<List<Int>>()
    if(root == null) return result
    val queue : Queue<TreeNode> = LinkedList()
    queue.add(root)



    while(queue.isNotEmpty()){
        val levelSize =  queue.size
        val level = mutableListOf<Int>()


        repeat(levelSize) {
            val node = queue.poll()
            level.add(node.`val`) // добавляем значение текущего узла

            if (node.left != null) queue.add(node.left)
            if (node.right != null) queue.add(node.right)
        }
        result.add(level)
    }
    return result
}