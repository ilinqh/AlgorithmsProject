package easy

import java.util.*

class _724FindPivotIndex {
    class Solution {
        fun pivotIndex(nums: IntArray): Int {
            val total = Arrays.stream(nums).sum()
            var left = 0
            for (i in nums.indices) {
                if (left * 2 + nums[i] == total) {
                    return i
                }
                left += nums[i]
            }
            return -1
        }
    }
}