package easy

import ListNode

class _237DeleteNodeInALinkedList {
    class Solution {
        fun deleteNode(node: ListNode?) {
            if (node == null) {
                return
            }
            node.`val` = node.next!!.`val`
            node.next = node.next?.next
        }
    }
}