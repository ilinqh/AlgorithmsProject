package medium

import ListNode

class _148SortList {
    class BestSolution {
        fun sortList(head: ListNode?): ListNode? {
            if (head == null) {
                return head
            }
            var length = 0
            var node = head
            while (node != null) {
                length++
                node = node.next
            }
            val dummyHead = ListNode(0, head)
            var subLength = 1
            while (subLength < length) {
                var prev: ListNode? = dummyHead
                var curr = dummyHead.next
                while (curr != null) {
                    val head1: ListNode = curr
                    run {
                        var i = 1
                        while (i < subLength && curr!!.next != null) {
                            curr = curr!!.next
                            i++
                        }
                    }
                    val head2 = curr!!.next
                    curr!!.next = null
                    curr = head2
                    var i = 1
                    while (i < subLength && curr != null && curr!!.next != null) {
                        curr = curr!!.next
                        i++
                    }
                    var next: ListNode? = null
                    if (curr != null) {
                        next = curr!!.next
                        curr!!.next = null
                    }
                    val merged = merge(head1, head2)
                    prev!!.next = merged
                    while (prev!!.next != null) {
                        prev = prev.next
                    }
                    curr = next
                }
                subLength = subLength shl 1
            }
            return dummyHead.next
        }

        fun merge(head1: ListNode?, head2: ListNode?): ListNode? {
            val dummyHead = ListNode(0)
            var temp: ListNode? = dummyHead
            var temp1 = head1
            var temp2 = head2
            while (temp1 != null && temp2 != null) {
                if (temp1.`val` <= temp2.`val`) {
                    temp!!.next = temp1
                    temp1 = temp1.next
                } else {
                    temp!!.next = temp2
                    temp2 = temp2.next
                }
                temp = temp.next
            }
            if (temp1 != null) {
                temp!!.next = temp1
            } else if (temp2 != null) {
                temp!!.next = temp2
            }
            return dummyHead.next
        }
    }
}