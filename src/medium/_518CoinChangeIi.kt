package medium

class _518CoinChangeIi {
    class Solution {
        fun change(amount: Int, coins: IntArray): Int {
            val dp = IntArray(amount + 1) { 0 }
            dp[0] = 1
            for (coin in coins) {
                var i = coin
                while (i <= amount) {
                    dp[i] += dp[i - coin]
                    i += 1
                }
            }
            return dp[amount]
        }
    }
}