package medium

class _322CoinChange {
    class Solution {
        fun coinChange(coins: IntArray, amount: Int): Int {
            val dp = IntArray(amount + 1) { amount + 1 }
            dp[0] = 0
            for (i in 1..amount) {
                for (j in coins.indices) {
                    if (coins[j] <= i) {
                        dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1)
                    }
                }
            }
            return if ((dp[amount] > amount)) {
                -1
            } else {
                dp[amount]
            }
        }
    }
}