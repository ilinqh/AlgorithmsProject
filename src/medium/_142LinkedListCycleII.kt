package medium

import ListNode

class _142LinkedListCycleII {
    class Solution {
        fun detectCycle(head: ListNode?): ListNode? {
            if (head?.next == null) {
                return null
            }
            var slow = head
            var fast = head
            while (fast != null) {
                slow = slow!!.next
                if (fast.next == null) {
                    return null
                } else {
                    fast = fast.next?.next
                }
                if (fast == slow) {
                    var ptr = head
                    while (slow != ptr) {
                        slow = slow!!.next
                        ptr = ptr!!.next
                    }
                    return ptr
                }
            }

            return null
        }
    }
}