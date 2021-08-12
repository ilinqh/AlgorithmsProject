package medium

import ListNode

class _19RemoveNthNodeFromEndOfList {
    class Solution {
        fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
            if (head == null) {
                return head
            }
            val preHead = ListNode(0)
            preHead.next = head
            var fast: ListNode? = preHead
            var slow = preHead
            for (i in 0 until n) {
                fast = fast?.next
            }

            while (fast?.next != null) {
                fast = fast.next
                slow = slow.next!!
            }
            slow.next = slow.next!!.next

            return preHead.next
        }
    }

    // Best

    class BestSolution {
        fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
            if (head?.next == null && n == 1) return null
            var preNode: ListNode? = null
            var i = 0
            var node = head
            while (node != null) {
                i++
                if (i >= n + 1) {
                    preNode = if (preNode == null) {
                        head
                    } else {
                        preNode.next
                    }
                }
                node = node.next
            }
            if (preNode == null) return head!!.next
            preNode.next = preNode.next!!.next
            return head
        }
    }
}