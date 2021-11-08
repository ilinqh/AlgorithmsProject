package medium

class _279PerfectSquares {
    class Solution {
        fun numSquares(n: Int): Int {
            val dp = IntArray(n + 1)
            var min: Int
            for (i in 1..n) {
                min = Int.MAX_VALUE
                var j = 1
                while (j * j <= i) {
                    min = Math.min(min, dp[i - j * j])
                    j += 1
                }
                dp[i] = min + 1
            }
            return dp[n]
        }
    }
}