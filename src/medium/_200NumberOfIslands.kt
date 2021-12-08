package medium

import java.util.*

class _200NumberOfIslands {
    class Solution {
        fun numIslands(grid: Array<CharArray>): Int {
            if (grid.isEmpty()) {
                return 0
            }
            val row = grid.size
            val column = grid[0].size
            var ans = 0
            for (i in 0 until row) {
                for (j in 0 until column) {
                    if (grid[i][j] == '1') {
                        ans += 1
                        dfs(i, j, grid)
                    }
                }
            }
            return ans
        }

        private fun dfs(i: Int, j: Int, grid: Array<CharArray>) {
            val row = grid.size
            val column = grid[0].size

            if (i < 0 || i >= row || j < 0 || j >= column || grid[i][j] == '0') {
                return
            }
            grid[i][j] = '0'
            dfs(i - 1, j, grid)
            dfs(i + 1, j, grid)
            dfs(i, j - 1, grid)
            dfs(i, j + 1, grid)
        }
    }

    class BadSolution {
        fun numIslands(grid: Array<CharArray>): Int {
            if (grid.isEmpty()) {
                return 0
            }
            val nr = grid.size
            val nc = grid[0].size
            var ans = 0
            for (r in 0 until nr) {
                for (c in 0 until nc) {
                    if (grid[r][c] == '1') {
                        ans += 1
                        grid[r][c] = '0'
                        val neighbors = LinkedList<Int>()
                        neighbors.add(r * nc + c)
                        while (neighbors.isNotEmpty()) {
                            val id = neighbors.remove()
                            val row = id / nc
                            val col = id % nc
                            if (row - 1 >= 0 && grid[row - 1][col] == '1') {
                                neighbors.add((row - 1) * nc + col)
                                grid[row - 1][col] = '0'
                            }
                            if (row + 1 < nr && grid[row + 1][col] == '1') {
                                neighbors.add((row + 1) * nc + col)
                                grid[row + 1][col] = '0'
                            }
                            if (col - 1 >= 0 && grid[row][col - 1] == '1') {
                                neighbors.add(row * nc + col - 1)
                                grid[row][col - 1] = '0'
                            }
                            if (col + 1 < nc && grid[row][col + 1] == '1') {
                                neighbors.add(row * nc + col + 1)
                                grid[row][col + 1] = '0'
                            }
                        }
                    }
                }
            }
            return ans
        }
    }
}