package BFS

import java.util.LinkedList
import java.util.Queue


class TreeNode(var `val`: Int) {
         var left: TreeNode? = null
         var right: TreeNode? = null
     }


fun isSymmetric(root: TreeNode?): Boolean {
        if( root == null ) return false


    fun isMirror(t1: TreeNode?, t2: TreeNode?): Boolean {
        if( t1 == null && t2 == null) return true
        if(t1 == null || t2 == null) return false
        if( t1.`val` != t2.`val`) return false

        return  isMirror(t1.left, t2.right) && isMirror(t1.right, t2.left)
    }


    return  isMirror(root.left, root.right)
}