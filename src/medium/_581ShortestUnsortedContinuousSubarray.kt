package medium

class _581ShortestUnsortedContinuousSubarray {
    class Solution {
        fun findUnsortedSubarray(nums: IntArray): Int {
            val n = nums.size
            var maxN = Int.MIN_VALUE
            var right = -1
            var minN = Int.MAX_VALUE
            var left = -1
            for (i in 0 until n) {
                if (maxN > nums[i]) {
                    right = i
                } else {
                    maxN = nums[i]
                }
                if (minN < nums[n - i - 1]) {
                    left = n - i - 1
                } else {
                    minN = nums[n - i - 1]
                }
            }
            return if (right == -1) {
                0
            } else {
                right - left + 1
            }
        }
    }
}