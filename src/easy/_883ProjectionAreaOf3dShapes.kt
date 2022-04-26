package easy

class _883ProjectionAreaOf3dShapes {
    class Solution {
        fun projectionArea(grid: Array<IntArray>): Int {
            var ans = 0
            val n = grid.size
            var xMax = 0
            var yMax = 0
            for (i in 0 until n) {
                xMax = 0
                yMax = 0
                for (j in 0 until n) {
                    if (grid[i][j] > 0) {
                        ans += 1
                    }
                    xMax = Math.max(xMax, grid[i][j])
                    yMax = Math.max(yMax, grid[j][i])
                }
                ans += xMax
                ans += yMax
            }
            return ans
        }
    }
}