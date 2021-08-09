package easy

class _70ClimbingStairs {
    class Solution {
        fun climbStairs(n: Int): Int {
            if (n == 1) {
                return 1
            }
            if (n == 2) {
                return 2
            }
            val dp = IntArray(n + 1)
            dp[1] = 1
            dp[2] = 2
            for (i in 3..n) {
                dp[i] = dp[i - 1] + dp[i - 2]
            }
            return dp[n]
        }
    }

    // Best

    class BestSolution {
        fun climbStairs(n: Int): Int {
            val dp = Array(n + 1) { 0 }
            for (i in 0..n) {
                if (i == 0) {
                    dp[0] = 1
                    continue
                }
                if (i == 1) {
                    dp[1] = 1
                    continue
                }
                dp[i] = dp[i - 1] + dp[i - 2]
            }
            return dp[n]
        }
    }
}