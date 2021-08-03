package easy

import kotlin.math.max

class _53MaximumSubarray {
    class Solution {
        fun maxSubArray(nums: IntArray): Int {
            /**
             *     int sum = 0;
            int max = Integer.MIN_VALUE;
            for(int i = 0; i < nums.length; ++i) {
            sum = Math.max(nums[i], sum + nums[i]);
            max = Math.max(sum, max);
            }
            return max;
             */
            val dp = IntArray(nums.size)
            var max = Integer.MIN_VALUE
            for (index in nums.indices) {
                if (index == 0 || dp[index - 1] <= 0) {
                    dp[index] = nums[index]
                } else {
                    dp[index] = dp[index - 1] + nums[index]
                }
                max = max(max, dp[index])
            }
            return max
        }
    }
}