package easy

import ListNode

class _83RemoveDuplicatesFromSortedList {
    class Solution {
        fun deleteDuplicates(head: ListNode?): ListNode? {
            if (head == null) {
                return null
            }
            val preHead = ListNode(Int.MIN_VALUE)
            var prev: ListNode? = head
            var tempHead: ListNode? = head
            preHead.next = prev
            var value = head.`val`

            while (tempHead?.next != null) {
                if (tempHead.next!!.`val` > value) {
                    value = tempHead.next!!.`val`
                    prev?.next = tempHead.next
                    prev = prev?.next
                }
                tempHead = tempHead.next
            }
            prev?.next = null
            return preHead.next
        }
    }

    class BestSolution {
        fun deleteDuplicates(head: ListNode?): ListNode? {
            if (head == null) return head
            var temp = head
            while (temp?.next != null) {
                if (temp.`val` == temp.next!!.`val`) {
                    temp.next = temp.next!!.next
                } else {
                    temp = temp.next
                }
            }
            return head
        }
    }

}