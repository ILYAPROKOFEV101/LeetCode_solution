import HashTable.ListNode
import java.util.*

class Solution {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        val dumy = ListNode(0)
        if(list1 == null && list2 == null) return dumy

        var current = dumy

        var l = list1
        var r = list2

        while(l != null && r != null){
            if(l.`val` < r.`val`){
                current.next = l
                l = l.next
            } else {
                current.next = r
                r = r.next
            }
            current = current.next!!
        }

        current.next = l ?: r

        return dumy.next
    }
}