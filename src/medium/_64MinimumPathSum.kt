package medium

class _64MinimumPathSum {
    class Solution {
        fun minPathSum(grid: Array<IntArray>): Int {
            val row = grid.size
            val column = grid[0].size
            val dp = IntArray(column)
            dp[0] = grid[0][0]
            for (i in 1 until column) {
                dp[i] = dp[i - 1] + grid[0][i]
            }
            var last: Int
            for (i in 1 until row) {
                last = dp[0] + grid[i][0]
                dp[0] = last
                for (j in 1 until column) {
                    dp[j] = Math.min(last, dp[j]) + grid[i][j]
                    last = dp[j]
                }
            }
            return dp[column - 1]
        }
    }
}