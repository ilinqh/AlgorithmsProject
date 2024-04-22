package medium

class _377CombinationSumIv {
    class Solution {
        fun combinationSum4(nums: IntArray, target: Int): Int {
            val dp = IntArray(target + 1)
            dp[0] = 1
            for (i in 1..target) {
                for (num in nums) {
                    if (num <= i) {
                        dp[i] += dp[i - num]
                    }
                }
            }
            return dp[target]
        }
    }
}