package LinkedList

import HashTable.ListNode

fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
    val dummy = ListNode(0)
    if( list1 == null && list2 == null) {
        return null
    }

    var current = dummy

    var l = list1
    var r = list2

    while(l?.next != null && r?.next != null) {
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



    return dummy.next

}