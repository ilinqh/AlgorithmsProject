package easy

import ListNode

class _206ReverseLinkedList {
    class Solution {
        fun reverseList(head: ListNode?): ListNode? {
            if (head?.next == null) {
                return head
            }
            var pre: ListNode? = null
            var cur: ListNode? = head
            var next: ListNode? = null
            while (cur != null) {
                next = cur.next
                cur.next = pre
                pre = cur
                cur = next
            }
            return pre
        }
    }
}