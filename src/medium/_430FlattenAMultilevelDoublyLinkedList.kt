package medium

import Node

class _430FlattenAMultilevelDoublyLinkedList {
    class Solution {
        fun flatten(head: Node?): Node? {
            dfs(head)
            return head
        }

        private fun dfs(head: Node?): Node? {
            var tempHead = head
            var last = tempHead
            while (tempHead != null) {
                if (tempHead.child == null) {
                    last = tempHead
                    tempHead = tempHead.next
                } else {
                    val next = tempHead.next
                    val childLast = dfs(tempHead.child)
                    tempHead.next = tempHead.child
                    tempHead.child?.prev = tempHead
                    tempHead.child = null
                    if (childLast != null) {
                        childLast.next = next
                    }
                    if (next != null) {
                        next.prev = childLast
                    }
                    last = tempHead
                    tempHead = childLast
                }
            }
            return last
        }
    }
}