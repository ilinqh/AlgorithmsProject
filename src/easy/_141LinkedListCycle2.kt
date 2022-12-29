package easy

import ListNode

class _141LinkedListCycle2 {
    class Solution {
        fun hasCycle(head: ListNode?): Boolean {
            var slow = head
            var fast = head?.next
            while (slow != null && fast != null) {
                if (slow == fast) {
                    return true
                }
                slow = slow.next
                fast = fast.next?.next
            }
            return false
        }
    }
}