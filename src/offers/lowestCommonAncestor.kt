package offers


  class TreeNode(var `val`: Int = 0) {
      var left: TreeNode? = null
      var right: TreeNode? = null
  }


class Solution {
    fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {

        var left = lowestCommonAncestor(root?.left, p, q)
        var right = lowestCommonAncestor(root?.right, p, q)

       return  when {
            left != null && right != null -> root
            left != null -> right
            else -> left
        }
    }
}