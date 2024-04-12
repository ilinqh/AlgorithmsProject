package easy

class _2923FindChampionI {
    class Solution {
        fun findChampion(grid: Array<IntArray>): Int {
            val size = grid.size
            for (i in grid.indices) {
                val line = grid[i]
                var sum = 0
                for (item in line) {
                    if (item == 1) {
                        sum += 1
                    }
                }
                if (sum == size - 1) {
                    return i
                }
            }
            return -1
        }
    }
}