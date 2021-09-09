package medium

import ListNode

class _92ReverseLinkedListII {
    class Solution {
        fun reverseBetween(head: ListNode?, left: Int, right: Int): ListNode? {
            if (head?.next == null || left == right) {
                return head
            }

            return null
        }
    }
}