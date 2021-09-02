package coding_interviews

import ListNode

class Offer_22KLCOF {
    class Solution {
        fun getKthFromEnd(head: ListNode?, k: Int): ListNode {
            val preHead = ListNode(0)
            preHead.next = head
            var slow = preHead
            var fast: ListNode? = preHead
            for (i in 0 until k) {
                fast = fast?.next!!
            }
            while (fast != null) {
                slow = slow.next!!
                fast = fast.next
            }
            return slow
        }
    }
}