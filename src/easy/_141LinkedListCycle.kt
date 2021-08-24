package easy

import ListNode

class _141LinkedListCycle {
    class Solution {
        fun hasCycle(head: ListNode?): Boolean {
            if (head?.next == null) {
                return false
            }
            var slow = head
            var fast = head.next
            while (slow != fast) {
                if (slow == null || fast == null) {
                    return false
                }
                slow = slow.next
                fast = fast.next?.next
            }
            return true
        }
    }
}