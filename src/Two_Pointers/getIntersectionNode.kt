package Two_Pointers

import HashTable.ListNode

fun getIntersectionNode(headA: ListNode?, headB:ListNode?):ListNode? {
    var a = headA
    var b = headB
    while(a !== b) {
        a = if(a != null) a.next else headB
        b = if(b != null) b.next else headA
    }
    return a
}