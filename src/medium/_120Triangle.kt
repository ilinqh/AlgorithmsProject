package medium

class _120Triangle {
    class Solution {
        fun minimumTotal(triangle: List<List<Int>>): Int {
            val length = triangle.size
            val dp = IntArray(length)
            for (i in 0 until length) {
                for (j in i downTo 0) {
                    when (j) {
                        0 -> {
                            dp[j] = dp[j] + triangle[i][j]
                        }
                        i -> {
                            dp[j] = dp[j - 1] + triangle[i][j]
                        }
                        else -> {
                            dp[j] = Math.min(dp[j - 1], dp[j]) + triangle[i][j]
                        }
                    }
                }
            }
            var ans = dp[0]
            for (i in 1 until length) {
                ans = Math.min(ans, dp[i])
            }
            return ans
        }
    }
}