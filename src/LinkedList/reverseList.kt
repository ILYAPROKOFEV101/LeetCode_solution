package LinkedList

import HashTable.ListNode


fun reverseList(head: ListNode?): ListNode? {

    var prev: ListNode? = null
    var current = head

    while(current !=null){
        var next = current.next
        current.next = prev
        prev = current
        current = next

    }

    return prev
        
}