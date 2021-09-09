package medium

import ListNode

class _86PartitionList {
    class Solution {
        fun partition(head: ListNode?, x: Int): ListNode? {
            if (head == null) {
                return head
            }
            val preHead = ListNode(0)
            preHead.next = head
            var preV = preHead.next
            var lowCurr: ListNode? = preHead
            while (preV != null && preV.`val` < x) {
                lowCurr = preV
                preV = preV.next
            }
            if (preV == null) {
                return preHead.next
            }
            val highPreHead = preV
            var highPreV = preV
            var highCurr = highPreV.next
            while (highCurr != null) {
                if (highCurr.`val` < x) {
                    highPreV!!.next = highCurr.next
                    lowCurr!!.next = highCurr
                    lowCurr = lowCurr.next
                    highCurr = highCurr.next
                } else {
                    highPreV = highPreV?.next
                    highCurr = highCurr.next
                }
            }
            lowCurr!!.next = highPreHead

            return preHead.next
        }
    }
}