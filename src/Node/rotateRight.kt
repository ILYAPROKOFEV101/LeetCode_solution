package Node

import HashTable.ListNode

fun rotateRight(head: ListNode?, k: Int): ListNode? {
    if( head == null || head.next == null || k == 0) {
        return head
    }

    // Посчитаем длину списка
    var length = 1
    var currant = head
    while(currant?.next != null) {
        currant = currant.next
        length++
    }

    currant?.next = head

    var stepsToNewHead = length - (k % length)

    currant = head
    for(i in 1 until stepsToNewHead) {
        currant = currant?.next
    }
    val newHead = currant?.next
    currant?.next = null
    return newHead

}