package HashTable

class ListNode(var `val`: Int){
    var next: ListNode? = null
}


fun hasCycle(head: ListNode?): Boolean {
    var slow = head
    var fast = head

    while(fast?.next != null){
        slow = slow?.next
        fast = fast.next?.next

        if(fast?.next == null){
            return true
        }
    }

    return false



}