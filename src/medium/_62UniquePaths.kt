package medium

class _62UniquePaths {
    class Solution {
        fun uniquePaths(m: Int, n: Int): Int {

            val map = Array(m) {
                IntArray(n)
            }
            for (i in 0 until m) {
                map[i][0] = 1
            }
            for (i in 0 until n) {
                map[0][i] = 1
            }
            for (i in 1 until m) {
                for (j in 1 until n) {
                    map[i][j] = map[i - 1][j] + map[i][j - 1]
                }
            }
            return map[m - 1][n - 1]
        }
    }
}