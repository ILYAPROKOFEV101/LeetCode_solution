import leetcode75.TreeNode
import java.util.*

fun zigzagLevelOrder(root: TreeNode?): List<List<Int>> {
    val result = mutableListOf<List<Int>>()
    if(root == null) return result

    var levelNumber = 0

    val queue : Queue<TreeNode> = LinkedList()
    queue.add(root)

    while(queue.isNotEmpty()){
        val levelSize  = queue.size
        val level = mutableListOf<Int>()

        repeat(levelSize){
            var node = queue.poll()

            if(node.`val` != null){
                level.add(node.`val`)
                if(node.left != null ) queue.add(node.left)
                if(node.right != null) queue.add(node.right)
            }
        }

        if(levelNumber % 2 == 0){
            result.add(level.reversed())
        } else {
            result.add(level)
        }

        levelNumber++
    }
    return result
}