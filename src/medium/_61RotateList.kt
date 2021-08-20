package medium

import ListNode

class _61RotateList {
    class Solution {
        fun rotateRight(head: ListNode?, k: Int): ListNode? {
            if (head?.next == null) {
                return head
            }
            val preHead = ListNode(0)
            preHead.next = head
            var temp = preHead.next
            var listCount = 1
            while (temp?.next != null) {
                listCount++
                temp = temp.next
            }
            temp!!.next = preHead.next
            val step = listCount - (k % listCount)
            for (i in 0 until step) {
                temp = temp!!.next
            }
            preHead.next = temp!!.next
            temp.next = null
            return preHead.next
        }
    }
}