package medium

class _300LongestIncreasingSubsequence {
    class Solution {
        fun lengthOfLIS(nums: IntArray): Int {
            if (nums.isEmpty()) {
                return 0
            }
            val dp = IntArray(nums.size + 1) { 1 }
            var maxAns = 1
            for (i in 1 until nums.size) {
                for (j in 0 until i) {
                    if (nums[i] > nums[j]) {
                        dp[i] = Math.max(dp[j] + 1, dp[i])
                    }
                }
                maxAns = Math.max(maxAns, dp[i])
            }
            return maxAns
        }
    }
}