package easy

import ListNode

class _83RemoveDuplicatesFromSortedList {
    class Solution {
        fun deleteDuplicates(head: ListNode): ListNode {
            val preHead = ListNode(0)
            preHead.next = head
            var prev = preHead.next
            var value = prev?.`val` ?: 0
            while (prev?.next != null) {
                if (prev.next!!.`val` > value) {
                    value = prev.next!!.`val`
                    prev.next = prev.next
                    prev = prev.next
                } else {
                    prev = prev.next!!.next
                }
            }
            return preHead.next!!
        }
    }
}