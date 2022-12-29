package medium

import ListNode

class _19RemoveNthNodeFromEndOfList2 {
    class Solution {
        fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
            head ?: return head
            val preHead = ListNode(0)
            preHead.next = head
            var slow = preHead
            var fast: ListNode? = preHead
            for (i in 0 until n) {
                fast = fast?.next
            }
            while (fast?.next != null) {
                slow = slow.next!!
                fast = fast.next
            }
            val node = slow.next
            slow.next = node?.next
            return preHead.next
        }
    }
}