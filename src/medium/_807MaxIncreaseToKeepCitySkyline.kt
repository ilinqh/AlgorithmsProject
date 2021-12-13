package medium

class _807MaxIncreaseToKeepCitySkyline {
    class Solution {
        fun maxIncreaseKeepingSkyline(grid: Array<IntArray>): Int {
            val size = grid.size
            val rowMax = IntArray(size)
            val columnMax = IntArray(size)
            for (i in 0 until size) {
                for (j in 0 until size) {
                    rowMax[i] = Math.max(rowMax[i], grid[i][j])
                    columnMax[j] = Math.max(columnMax[j], grid[i][j])
                }
            }
            var ans = 0
            for (i in 0 until size) {
                for (j in 0 until size) {
                    ans += Math.min(rowMax[i], columnMax[j]) - grid[i][j]
                }
            }
            return ans
        }
    }
}