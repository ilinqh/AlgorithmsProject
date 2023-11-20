package solution_java.medium;

public class _53MaximumSubarray {
    public class Solution {
        public int maxSubArray(int[] nums) {
            int n = nums.length;
            if (n == 1) {
                return nums[0];
            }
            int result = nums[0];
            int[] dp = new int[n];
            dp[0] = result;
            for (int i = 1; i < n; i++) {
                dp[i] = Math.max(dp[i - 1], 0) + nums[i];
                result = Math.max(result, dp[i]);
            }
            return result;
        }
    }

    public class BaseSolution {

        public int maxSubArray(int[] nums) {
            int pre = 0;
            int res = nums[0];
            for (int num : nums) {
                pre = Math.max(pre + num, num);
                res = Math.max(res, pre);
            }
            return res;
        }
    }
}
