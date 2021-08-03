package easy

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class MergeTwoSortedListsSolution {
    fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
        var tempL1 = l1
        var tempL2 = l2
        val preHead = ListNode(-1)
        var prev = preHead
        while (tempL1 != null && tempL2 != null) {
            if (tempL1.`val` <= tempL2.`val`) {
                prev.next = tempL1
                tempL1 = tempL1.next
            } else {
                prev.next = tempL2
                tempL2 = tempL2.next
            }
            prev = prev.next!!
        }
        prev.next = tempL1 ?: tempL2
        return preHead.next
    }
}