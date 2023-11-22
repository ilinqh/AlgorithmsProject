package medium

class _2304MinimumPathCostInAGrid {
    class Solution {
        fun minPathCost(grid: Array<IntArray>, moveCost: Array<IntArray>): Int {
            val row = grid.size
            val column = grid[0].size
            val dp = Array(row) {
                IntArray(column) {
                    0
                }
            }
            for (c in 0 until column) {
                dp[0][c] = grid[0][c]
            }
            for (r in 1 until row) {
                for (c in 0 until column) {
                    var temp = Int.MAX_VALUE
                    for (i in 0 until column) {
                        temp = Math.min(temp, dp[r - 1][i] + moveCost[grid[r - 1][i]][c])
                    }
                    dp[r][c] = grid[r][c] + temp
                }
            }

            var result = dp[row - 1][0]
            for (c in 1 until column) {
                result = Math.min(result, dp[row - 1][c])
            }
            return result
        }
    }
}