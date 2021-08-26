package easy

import ListNode

class _206ReverseLinkedList {
    class Solution {
        fun reverseList(head: ListNode?): ListNode? {
            if (head?.next == null) {
                return head
            }
            var preV = ListNode(0, head)
            var next: ListNode? = head.next
            while (next?.next != null) {

            }
            return preV.next
        }
    }
}