package medium

import ListNode

class _24SwapNodesInPairs {
    class Solution {
        fun swapPairs(head: ListNode?): ListNode? {
            if (head?.next == null) {
                return head
            }
            val dummyHead = ListNode(0)
            dummyHead.next = head
            var temp = dummyHead
            while (temp.next != null && temp.next?.next != null) {
                val node1 = temp.next!!
                val node2 = temp.next!!.next!!
                node1.next = node2.next
                node2.next = node1
                temp.next = node2
                temp = node1
            }
            return dummyHead.next
        }
    }
}