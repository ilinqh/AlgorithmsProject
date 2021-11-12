package medium

class _375GuessNumberHigherOrLowerIi {
    class Solution {
        fun getMoneyAmount(n: Int): Int {
            val dp = Array(n + 1) { IntArray(n + 1) }
            for (i in (n - 1) downTo 1) {
                for (j in (i + 1)..n) {
                    var min = Int.MAX_VALUE
                    for (k in i until j) {
                        val cost = k + Math.max(dp[i][k - 1], dp[k + 1][j])
                        min = Math.min(cost, min)
                    }
                    dp[i][j] = min
                }
            }
            return dp[1][n]
        }
    }
}