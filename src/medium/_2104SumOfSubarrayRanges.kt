package medium

class _2104SumOfSubarrayRanges {
    class Solution {
        fun subArrayRanges(nums: IntArray): Long {
            var max: Int
            var min: Int
            var ans = 0L
            for (i in nums.indices) {
                max = nums[i]
                min = nums[i]
                for (j in (i + 1) until nums.size) {
                    max = Math.max(max, nums[j])
                    min = Math.min(min, nums[j])
                    ans += max - min
                }
            }
            return ans
        }
    }
}