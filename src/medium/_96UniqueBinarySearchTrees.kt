package medium

class _96UniqueBinarySearchTrees {
    class Solution {
        fun numTrees(n: Int): Int {
            val dp = IntArray(n + 1)
            dp[0] = 1
            dp[1] = 1
            for (i in 2..n) {
                for (j in 1..i) {
                    dp[i] += dp[j - 1] * dp[i - j]
                }
            }
            return dp[n]
        }
    }

    class BestSolution {
        fun numTrees(n: Int): Int {
            var C = 1L
            for (i in 0 until n) {
                C = C * 2 * (2 * i + 1) / (i + 2)
            }
            return C.toInt()
        }
    }
}