package easy

import java.util.*

class _496NextGreaterElementI {
    class Solution {
        fun nextGreaterElement(nums1: IntArray, nums2: IntArray): IntArray {
            val stack = ArrayDeque<Int>()
            val map = HashMap<Int, Int>()
            for (i in (nums2.size - 1) downTo 0) {
                val num = nums2[i]
                while (stack.isNotEmpty() && stack.peek() <= num) {
                    stack.pop()
                }
                map[num] = if (stack.isEmpty()) {
                    -1
                } else {
                    stack.peek()
                }
                stack.push(num)
            }
            val result = IntArray(nums1.size)
            for (i in nums1.indices) {
                result[i] = map[nums1[i]]!!
            }
            return result
        }
    }
}