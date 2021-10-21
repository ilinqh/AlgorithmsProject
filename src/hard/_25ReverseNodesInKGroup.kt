package hard

import ListNode

class _25ReverseNodesInKGroup {
    class Solution {
        fun reverseKGroup(head: ListNode?, k: Int): ListNode? {
            if (head?.next == null || k == 1) {
                return head
            }
            val preHead = ListNode(0)
//            preHead.next = head
            var pre: ListNode? = null
            var cur = head
            var step: Int
            var first = true
            while (cur != null) {
                step = k
                var tail = cur
                var reverse = false
                while (tail != null && step > 0) {
                    tail = tail.next
                    step -= 1
                    reverse = step == 0
                }
                if (reverse) {
                    step = k
                    var next: ListNode?
                    while (step > 0) {
                        next = cur?.next
                        cur?.next = pre
                        pre = cur
                        cur = next
                        step -= 1
                    }
                    if (first) {
                        first = false
                        preHead.next = pre
                    }
                } else {
                    break
                }
            }
            return preHead.next
        }
    }
}