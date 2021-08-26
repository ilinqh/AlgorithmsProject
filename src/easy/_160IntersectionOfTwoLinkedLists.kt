package easy

import ListNode

class _160IntersectionOfTwoLinkedLists {
    // 双指针，pA/pB 分别会先遍历一遍 headA/headB，然后如果两个链表有焦点，则两个指针总共走过的路程一样长
    // 如果两个链表没有焦点，则 pA/pB 会同时到达 headB/headA 尾部
    class Solution {
        fun getIntersectionNode(headA: ListNode?, headB: ListNode?): ListNode? {
            if (headA == null || headB == null) {
                return null
            }
            var pA = headA
            var pB = headB
            while (pA != pB) {
                pA = if (pA == null) {
                    headB
                } else {
                    pA.next
                }
                pB = if (pB == null) {
                    headA
                } else {
                    pB.next
                }
            }
            return pA
        }
    }
}