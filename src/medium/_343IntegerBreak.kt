package medium

class _343IntegerBreak {
    class Solution {
        fun integerBreak(n: Int): Int {
            val dp = IntArray(n + 1)
            for (i in 2..n) {
                var curMax = 0
                for (j in 1 until i) {
                    curMax = Math.max(curMax, Math.max(j * (i - j), j * dp[i - j]))
                }
                dp[i] = curMax
            }
            return dp[n]
        }
    }
}