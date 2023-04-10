package medium

import ListNode
import java.util.*

class _1019NextGreaterNodeInLinkedList {
    class Solution {
        fun nextLargerNodes(head: ListNode?): IntArray {
            val ans = ArrayList<Int>()
            val stack = ArrayDeque<IntArray>()

            var cur = head
            var idx = -1
            while (cur != null) {
                idx += 1
                ans.add(0)
                while (stack.isNotEmpty() && stack.peek()[0] < cur.`val`) {
                    ans[stack.pop()[1]] = cur.`val`
                }
                stack.push(intArrayOf(cur.`val`, idx))
                cur = cur.next
            }

            val size = ans.size
            val result = IntArray(size)
            for (i in ans.indices) {
                result[i] = ans[i]
            }
            return result
        }

    }
}