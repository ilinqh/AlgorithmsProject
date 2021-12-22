package medium

class _494TargetSum {
    class BadSolution {
        private var result = 0
        fun findTargetSumWays(nums: IntArray, target: Int): Int {
            backtrack(nums, target, 0, 0)
            return result
        }

        private fun backtrack(nums: IntArray, target: Int, index: Int, sum: Int) {
            if (index == nums.size) {
                if (target == sum) {
                    result += 1
                }
            } else {
                backtrack(nums, target, index + 1, sum + nums[index])
                backtrack(nums, target, index + 1, sum - nums[index])
            }
        }
    }

    class Solution {
        fun findTargetSumWays(nums: IntArray, target: Int): Int {
            var sum = 0
            for (i in nums.indices) {
                sum += nums[i]
            }
            val diff = sum - target
            if (diff < 0 || diff % 2 != 0) {
                return 0
            }
            val neg = diff / 2
            val dp = IntArray(neg + 1)
            dp[0] = 1
            for (i in nums.indices) {
                val num = nums[i]
                var j = neg
                while (j >= num) {
                    dp[j] += dp[j - num]
                    j -= 1
                }
            }
            return dp[neg]
        }
    }
}