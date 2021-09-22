package medium

import ListNode

class _725SplitLinkedListInParts {
    class Solution {
        fun splitListToParts(head: ListNode?, k: Int): Array<ListNode?> {
            if (k == 1) {
                return arrayOf(head)
            }
            var n = 0
            var temp = head
            while (temp != null) {
                temp = temp.next
                n += 1
            }
            val quotient = n / k
            val remainder = n % k
            val parts = Array<ListNode?>(k) { null }
            var curr = head
            var i = 0
            while (i < k && curr != null) {
                parts[i] = curr
                val partSize = quotient + if (i < remainder) {
                    1
                } else {
                    0
                }
                for (j in 1 until partSize) {
                    curr = curr?.next
                }
                val next = curr?.next
                curr?.next = null
                curr = next
                i += 1
            }
            return parts
        }
    }
}