package easy

class _53MaximumSubarray {
    class Solution {
        fun maxSubArray(nums: IntArray): Int {
            val dp = IntArray(nums.size)
            var max = Integer.MIN_VALUE
            for (index in nums.indices) {
                if (index == 0 || dp[index - 1] <= 0) {
                    dp[index] = nums[index]
                } else {
                    dp[index] = dp[index - 1] + nums[index]
                }
                max = Math.max(max, dp[index])
            }
            return max
        }
    }

    class BestSolution {
        fun maxSubArray(nums: IntArray): Int {
            val n = nums.size
            val dp = IntArray(n)
            dp[0] = nums[0]
            var result = dp[0]
            for (i in 1 until n) {
                dp[i] = Math.max(dp[i - 1], 0) + nums[i]
                result = Math.max(result, dp[i])
            }
            return result
        }
    }
}