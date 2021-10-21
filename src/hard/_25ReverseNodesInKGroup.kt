package hard

import ListNode

class _25ReverseNodesInKGroup {
class Solution {
    fun reverseKGroup(head: ListNode?, k: Int): ListNode? {
        if (head?.next == null || k == 1) {
            return head
        }
        var tempHead: ListNode? = head
        val preHead = ListNode(0)
        preHead.next = tempHead
        var pre: ListNode? = preHead

        while (tempHead != null) {
            var tail = pre
            for (i in 0 until k) {
                tail = tail?.next
                if (tail == null) {
                    return preHead.next
                }
            }
            val next: ListNode? = tail!!.next
            val reverse = myReserve(tempHead, tail)
            tempHead = reverse[0]
            tail = reverse[1]
            pre?.next = tempHead
            tail.next = next
            pre = tail
            tempHead = tail.next
        }
        return preHead.next
    }

    private fun myReserve(head: ListNode, tail: ListNode): Array<ListNode> {
        var preV = tail.next
        var p: ListNode? = head
        while (preV != tail) {
            val next = p?.next
            p?.next = preV
            preV = p
            p = next
        }
        return arrayOf(tail, head)
    }
}
}