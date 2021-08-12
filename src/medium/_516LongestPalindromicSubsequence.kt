package medium

class _516LongestPalindromicSubsequence {

    // 动态规划
    class Solution {
        fun longestPalindromeSubseq(s: String): Int {
            val length = s.length
            if (length < 2) {
                return length
            }
            val dp = Array(length + 1) { IntArray(length + 1) }
            for (i in (length - 1) downTo 0) {
                dp[i][i] = 1
                for (j in (i + 1) until length) {
                    if (s[i] == s[j]) {
                        dp[i][j] = dp[i + 1][j - 1] + 2
                    } else {
                        dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1])
                    }
                }
            }
            return dp[0][length - 1]
        }
    }
}