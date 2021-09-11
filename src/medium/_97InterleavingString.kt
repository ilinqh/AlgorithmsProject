package medium

class _97InterleavingString {
    class Solution {
        fun isInterleave(s1: String, s2: String, s3: String): Boolean {
            val s1Length = s1.length
            val s2Length = s2.length
            val s3Length = s3.length
            if (s1Length + s2Length != s3Length) {
                return false
            }
            val dp = Array(s1Length + 1) {
                BooleanArray(s2Length + 1)
            }
            dp[0][0] = true
            for (i in 0..s1Length) {
                for (j in 0..s2Length) {
                    val index = i + j - 1
                    if (i > 0) {
                        dp[i][j] = dp[i][j] || (dp[i - 1][j] && s1[i - 1] == s3[index])
                    }
                    if (j > 0) {
                        dp[i][j] = dp[i][j] || (dp[i][j - 1] && s2[j - 1] == s3[index])
                    }
                }
            }
            return dp[s1Length][s2Length]
        }
    }

    class BestSolution {
        fun isInterleave(s1: String, s2: String, s3: String): Boolean {
            val s1Length = s1.length
            val s2Length = s2.length
            val s3Length = s3.length
            if (s1Length + s2Length != s3Length) {
                return false
            }
            val dp = BooleanArray(s2Length + 1)
            dp[0] = true
            for (i in 0..s1Length) {
                for (j in 0..s2Length) {
                    val index = i + j - 1
                    if (i > 0) {
                        dp[j] = dp[j] && s1[i - 1] == s3[index]
                    }
                    if (j > 0) {
                        dp[j] = dp[j] || (dp[j - 1] && s2[j - 1] == s3[index])
                    }
                }
            }
            return dp[s2Length]
        }
    }

}