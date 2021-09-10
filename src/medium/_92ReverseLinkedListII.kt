package medium

import ListNode

class _92ReverseLinkedListII {
    class Solution {
        fun reverseBetween(head: ListNode?, left: Int, right: Int): ListNode? {
            if (head?.next == null || left == right) {
                return head
            }
            val preHead = ListNode(0)
            preHead.next = head
            var preV = preHead
            var tempLeft = left
            while (tempLeft > 1) {
                preV = preV.next!!
                tempLeft -= 1
            }
            val curr = preV.next
            var next: ListNode?
            var index = 0
            while (index < right - left) {
                next = curr!!.next!!
                curr.next = next.next
                next.next = preV.next
                preV.next = next
                index += 1
            }

            return preHead.next
        }
    }
}