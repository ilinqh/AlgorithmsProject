package medium

import ListNode

class _2181MergeNodesInBetweenZeros {
    class Solution {
        fun mergeNodes(head: ListNode?): ListNode? {
            val preV = ListNode(0)

            var current = head
            var tempNode = current
            preV.next = tempNode

            while (current != null) {
                if (current.`val` == 0) {
                    if (tempNode!!.`val` != 0 && current.next != null) {
                        val next = ListNode(0)
                        tempNode.next = next
                        tempNode = next
                    }
                } else {
                    tempNode!!.`val` += current.`val`
                }
                current = current.next
            }
            tempNode!!.next = null
            return preV.next
        }
    }
}