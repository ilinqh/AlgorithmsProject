package medium

class _413ArithmeticSlices {
    // 动态规划思路
    class Solution {
        fun numberOfArithmeticSlices(nums: IntArray): Int {
            if (nums.size < 3) {
                return 0
            }
            var dp = 0
            var ans = 0
            for (i in 2 until nums.size) {
                if (nums[i - 1] - nums[i - 2] == nums[i] - nums[i - 1]) {
                    dp++
                } else {
                    dp = 0
                }
                ans += dp
            }
            return ans
        }
    }
}