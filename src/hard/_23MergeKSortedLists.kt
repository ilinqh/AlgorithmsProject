package hard

import ListNode

class _23MergeKSortedLists {
    class Solution {
        fun mergeKLists(lists: Array<ListNode?>): ListNode? {
            return merge(lists, 0, lists.size - 1)
        }

        private fun merge(lists: Array<ListNode?>, left: Int, right: Int): ListNode? {
            if (left == right) {
                return lists[left]
            }
            if (left > right) {
                return null
            }
            val middle = (left + right) shr 1
            return mergeTwoList(merge(lists, left, middle), merge(lists, middle + 1, right))
        }

        private fun mergeTwoList(tempList1: ListNode?, tempList2: ListNode?): ListNode? {
            if (tempList1 == null) {
                return tempList2
            }
            if (tempList2 == null) {
                return tempList1
            }
            val head = ListNode(0)
            var preV: ListNode
            var list1 = tempList1
            var list2 = tempList2
            if (list1.`val` <= list2.`val`) {
                preV = list1
                list1 = list1.next
            } else {
                preV = list2
                list2 = list2.next
            }
            head.next = preV

            while (list1 != null && list2 != null) {
                if (list1.`val` <= list2.`val`) {
                    preV.next = list1
                    list1 = list1.next
                } else {
                    preV.next = list2
                    list2 = list2.next
                }
                preV = preV.next!!
            }
            if (list1 == null) {
                preV.next = list2
            } else if (list2 == null) {
                preV.next = list1
            }

            return head.next
        }
    }
}