package easy

import ListNode

class _876MiddleOfTheLinkedList {
    class Solution {
        fun middleNode(head: ListNode?): ListNode? {
            val preHead = ListNode(0)
            preHead.next = head
            var slow = preHead
            var fast: ListNode? = preHead
            while (fast != null) {
                slow = slow.next!!
                fast = fast.next?.next
            }
            return slow
        }
    }
}