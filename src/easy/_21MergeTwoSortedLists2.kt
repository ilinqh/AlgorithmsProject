package easy

import ListNode

class _21MergeTwoSortedLists2 {
    class Solution {
        fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
            val head = ListNode(0)
            var preV = head

            var temp1 = list1
            var temp2 = list2
            while (temp1 != null && temp2 != null) {
                if (temp1.`val` <= temp2.`val`) {
                    preV.next = temp1
                    temp1 = temp1.next
                } else {
                    preV.next = temp2
                    temp2 = temp2.next
                }
                preV = preV.next!!
            }
            preV.next = temp1 ?: temp2
            return head.next
        }
    }
}