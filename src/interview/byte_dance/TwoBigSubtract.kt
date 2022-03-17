package interview.byte_dance

import ListNode

class TwoBigSubtract {

    class Solution {
        fun twoBigSubtract(node1: ListNode?, node2: ListNode?): ListNode? {
            if (node1 == null) {
                return node2
            }
            if (node2 == null) {
                return node1
            }
            val head = ListNode(-1)
            var needSubOne = 0
            var first = reverse(node1)
            var second = reverse(node2)
            while (first != null && second != null) {
                val result = first.`val` - second.`val` - needSubOne
                needSubOne = if (result < 0) {
                    1
                } else {
                    0
                }
                val node = ListNode(Math.abs(result))
                node.next = head.next
                head.next = node
                first = first.next
                second = second.next
            }
            var node = first ?: second
            while (node != null) {
                if (needSubOne == 1) {
                    node.`val` -= 1
                }
                val next = node.next
                node.next = head.next
                head.next = node
                node = next
            }
            return head.next
        }

        private fun reverse(node: ListNode?): ListNode? {
            if (node?.next == null) {
                return node
            }
            var tempNode: ListNode? = node
            val head = ListNode(-1)
            while (tempNode != null) {
                val next = tempNode.next
                tempNode.next = head.next
                head.next = tempNode
                tempNode = next
            }
            return head.next
        }
    }
}