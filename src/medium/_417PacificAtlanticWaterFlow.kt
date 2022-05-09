package medium

class _417PacificAtlanticWaterFlow {
    class Solution {
        private val ans = ArrayList<List<Int>>()
        private var m = 0
        private var n = 0
        private lateinit var tempHeights: Array<IntArray>
        fun pacificAtlantic(heights: Array<IntArray>): List<List<Int>> {
            tempHeights = heights
            m = heights.size
            n = heights[0].size
            dfs(0, 0, heights[0][0])
            return ans
        }

        private fun dfs(row: Int, column: Int, lastHeight: Int) {
            if (row < 0 || row == m || column < 0 || column >= n) {
                return
            }
            if (tempHeights[row][column] > lastHeight) {
                return
            }
            dfs(row - 1, column, tempHeights[row][column])
            dfs(row + 1, column, tempHeights[row][column])
            dfs(row, column - 1, tempHeights[row][column])
            dfs(row, column + 1, tempHeights[row][column])
        }
    }
}