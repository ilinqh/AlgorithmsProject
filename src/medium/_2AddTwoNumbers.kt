package medium

import ListNode


class _2AddTwoNumbers {
    class Solution {
        fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
            var tempL1 = l1
            var tempL2 = l2
            val preHead = ListNode(-1)
            var prev = preHead
            var plusOne = false
            var sum: Int
            var curL1Value: Int
            var curL2Value: Int
            while (tempL1 != null || tempL2 != null || plusOne) {
                sum = if (plusOne) {
                    1
                } else {
                    0
                }
                curL1Value = tempL1?.value ?: 0
                curL2Value = tempL2?.value ?: 0
                sum += curL1Value + curL2Value
                plusOne = false
                if (sum >= 10) {
                    sum -= 10
                    plusOne = true
                }
                prev.next = ListNode(sum)
                prev = prev.next!!
                tempL1 = tempL1?.next
                tempL2 = tempL2?.next
            }
            prev.next = tempL1 ?: tempL2
            return preHead.next
        }
    }
}