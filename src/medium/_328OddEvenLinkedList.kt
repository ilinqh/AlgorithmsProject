package medium

import ListNode

class _328OddEvenLinkedList {
    class Solution {
        fun oddEvenList(head: ListNode?): ListNode? {
            if (head?.next == null) {
                return head
            }
            val evenHead = head.next
            var oddList = head
            var evenList = evenHead
            while (evenList?.next != null) {
                oddList?.next = evenList.next
                oddList = oddList?.next
                evenList.next = oddList?.next
                evenList = evenList.next
            }
            oddList?.next = evenHead
            return head
        }
    }
}