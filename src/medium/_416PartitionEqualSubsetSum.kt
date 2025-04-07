package medium

class _416PartitionEqualSubsetSum {
    /**
     * not by self
     */
    class Solution {
        fun canPartition(nums: IntArray): Boolean {
            val size = nums.size
            if (size < 2) {
                return false
            }
            var sum = 0
            var max = 0
            for (num in nums) {
                sum += num
                max = Math.max(max, num)
            }
            if (sum % 2 != 0) {
                return false
            }
            val half = sum / 2
            if (max > half) {
                return false
            }
            val dp = Array(half + 1) {
                false
            }
            dp[0] = true
            for (i in 1 until size) {
                val num = nums[i]
                var j = half
                while (j >= num) {
                    dp[j] = dp[j] or dp[j - num]
                    j -= 1
                }
            }

            return dp[half]
        }
    }
}