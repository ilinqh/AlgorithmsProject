package medium

class _63UniquePathsII {
    class Solution {
        fun uniquePathsWithObstacles(obstacleGrid: Array<IntArray>): Int {
            val row = obstacleGrid.size
            val column = obstacleGrid[0].size
            val dp = IntArray(column)
            dp[0] = if (obstacleGrid[0][0] == 1) {
                0
            } else {
                1
            }
            for (i in 0 until row) {
                for (j in 0 until column) {
                    if (obstacleGrid[i][j] == 1) {
                        dp[j] = 0
                        continue
                    }
                    if (j > 0 && obstacleGrid[i][j - 1] == 0) {
                        dp[j] += dp[j - 1]
                    }
                }
            }
            return dp[column - 1]
        }
    }
}