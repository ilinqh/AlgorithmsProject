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

    // Best

    class BestSolution {
        fun swapPairs(head: ListNode?): ListNode? {
            //终止条件
            if (head?.next == null) {
                return head
            }

            val next = head.next
            //单次要执行  1head指向交换后的节点  2next指向head
            head.next = swapPairs(next?.next)
            next?.next = head
            return next
        }
    }

}