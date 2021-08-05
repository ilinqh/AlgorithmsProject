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
                curL1Value = tempL1?.`val` ?: 0
                curL2Value = tempL2?.`val` ?: 0
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

    // Best

    class BestSolution {
        fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
            val head = ListNode(0)
            var tail = head

            var node1 = l1
            var node2 = l2
            var tag = 0
            while (node1 != null) {
                if (node2 != null) {
                    var value = node1.`val` + node2.`val` + tag
                    if (value > 9) {
                        value -= 10
                        tag = 1
                    } else {
                        tag = 0
                    }
                    tail.next = ListNode(value)
                    node1 = node1.next
                    node2 = node2.next
                    tail = tail.next!!
                } else {
                    tail.next = node1
                    break
                }
            }
            if (node2 != null) {
                tail.next = node2
            }

            if (tag > 0) {
                var node = tail.next
                while (node != null) {
                    tail = node
                    if (node.`val` == 9) {
                        node.`val` = 0
                        node = node.next
                    } else {
                        tag = 0
                        node.`val` = node.`val` + 1
                        break
                    }
                }
                if (tag > 0) {
                    tail.next = ListNode(1)
                }
            }

            return head.next
        }
    }
}