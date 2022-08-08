package easy

import ListNode

class _234PalindromeLinkedList {
    class Solution {
        fun isPalindrome(head: ListNode?): Boolean {
            if (head?.next == null) {
                return true
            }
            var fast: ListNode? = ListNode(-1, head)
            var slow: ListNode? = ListNode(-1, head)
            while (fast != null) {
                fast = fast.next?.next
                slow = slow?.next
            }
            var next = slow?.next
            val slowHead = ListNode(-1, slow)
            while (next != null) {
                val cur = slowHead.next
                slowHead.next = next
                next = next.next
                slowHead.next?.next = cur
                cur?.next = null
            }
            val headPrev = ListNode(-1, head)
            while (slowHead.next != null) {
                if (headPrev.next?.`val` != slowHead.next?.`val`) {
                    return false
                }
                slowHead.next = slowHead.next?.next
                headPrev.next = headPrev.next?.next
            }
            return true
        }
    }
}