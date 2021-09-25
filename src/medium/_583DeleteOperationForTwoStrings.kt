package medium

class _583DeleteOperationForTwoStrings {
    class Solution {
        fun minDistance(word1: String, word2: String): Int {
            val n = word1.length
            val m = word2.length
            val dp = Array(n + 1) { IntArray(m + 1) }
            for (i in 0..n) dp[i][0] = i
            for (j in 0..m) dp[0][j] = j
            for (i in 1..n) {
                for (j in 1..m) {
                    dp[i][j] = Math.min(dp[i - 1][j] + 1, dp[i][j - 1] + 1)
                    if (word1[i - 1] == word2[j - 1]) {
                        dp[i][j] = Math.min(dp[i - 1][j - 1], dp[i][j])
                    }
                }
            }
            return dp[n][m]
        }
    }

    class BestSolution {
        fun minDistance(s1: String, s2: String): Int {
            val cs1 = s1.toCharArray()
            val cs2 = s2.toCharArray()
            val n = s1.length
            val m = s2.length
            val f = Array(n + 1) { IntArray(m + 1) }
            for (i in 0..n) f[i][0] = i
            for (j in 0..m) f[0][j] = j
            for (i in 1..n) {
                for (j in 1..m) {
                    f[i][j] = Math.min(f[i - 1][j] + 1, f[i][j - 1] + 1)
                    if (cs1[i - 1] == cs2[j - 1]) f[i][j] = Math.min(f[i][j], f[i - 1][j - 1])
                }
            }
            return f[n][m]
        }
    }

}