package medium

import ListNode

class _2807InsertGreatestCommonDivisorsInLinkedList {
    class Solution {
        fun insertGreatestCommonDivisors(head: ListNode?): ListNode? {
            var node = head
            while (node?.next != null) {
                node.next = ListNode(gcd(node.`val`, node.next!!.`val`), node.next)
                node = node.next!!.next
            }
            return head
        }

        private fun gcd(num1: Int, num2: Int): Int {
            var a = num1
            var b = num2
            while (b != 0) {
                val temp = a % b
                a = b
                b = temp
            }
            return a
        }
    }
}