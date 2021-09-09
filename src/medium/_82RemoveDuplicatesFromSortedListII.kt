package medium

import ListNode

class _82RemoveDuplicatesFromSortedListII {
    class Solution {
        fun deleteDuplicates(head: ListNode?): ListNode? {
            if (head?.next == null) {
                return head
            }
            val preHead = ListNode(0)
            preHead.next = head
            var preV: ListNode? = preHead
            var curr: ListNode? = head
            var next: ListNode? = curr?.next
            while (curr != null) {
                if (curr.`val` == next?.`val`) {
                    while (next?.`val` == curr.`val`) {
                        next = next.next
                    }
                    curr = next
                    preV?.next = curr
                    next = curr?.next
                } else {
                    preV?.next = curr
                    preV = preV?.next
                    curr = curr.next
                    next = curr?.next
                }
            }
            return preHead.next
        }
    }
}