package hard

class _1220CountVowelsPermutation {
    class Solution {
        private val mod = 1000000007
        fun countVowelPermutation(n: Int): Int {
            val dp = Array(n + 1) { LongArray(5) }
            dp[1] = longArrayOf(1, 1, 1, 1, 1)
            for (i in 2..n) {
                dp[i][0] = (dp[i - 1][1] + dp[i - 1][2] + dp[i - 1][4]) % mod
                dp[i][1] = (dp[i - 1][0] + dp[i - 1][2]) % mod
                dp[i][2] = (dp[i - 1][1] + dp[i - 1][3]) % mod
                dp[i][3] = dp[i - 1][2] % mod
                dp[i][4] = (dp[i - 1][2] + dp[i - 1][3]) % mod
            }
            var result = 0L
            for (i in 0 until 5) {
                result += dp[n][i]
            }
            return (result % mod).toInt()
        }
    }
}