package easy

import ListNode

class _206ReverseLinkedList2 {
    class Solution {
        fun reverseList(head: ListNode?): ListNode? {
            if (head?.next == null) {
                return head
            }
            var pre: ListNode? = null
            var cur = head
            var next = head.next
            while (cur != null) {
                cur.next = pre
                pre = cur
                cur = next
                next = next?.next
            }
            return pre
        }
    }
//
//    class AnswerSolution {
//        public ListNode reverseList(ListNode head) {
//            ListNode prev = null;
//            ListNode curr = head;
//            while (curr != null) {
//                ListNode next = curr.next;
//                curr.next = prev;
//                prev = curr;
//                curr = next;
//            }
//            return prev;
//        }
//    }

}