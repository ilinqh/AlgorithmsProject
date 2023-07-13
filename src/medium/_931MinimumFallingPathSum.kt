package medium

import java.util.*

class _931MinimumFallingPathSum {
    class Solution {
        fun minFallingPathSum(matrix: Array<IntArray>): Int {
            var result = Int.MAX_VALUE
            val n = matrix.size
            val dp = Array(n) {
                IntArray(n) { 0 }
            }

            System.arraycopy(matrix[0], 0, dp[0], 0, n)

            (1 until n).forEach { row ->
                (0 until n).forEach { column ->
                    var min = dp[row - 1][column]

                    if (column > 0) {
                        min = Math.min(min, dp[row - 1][column - 1])
                    }
                    if (column < n - 1) {
                        min = Math.min(min, dp[row - 1][column + 1])
                    }
                    dp[row][column] = matrix[row][column] + min
                }
            }
//            (0 until n).forEach {
//                result = Math.min(result, dp[n - 1][it])
//            }
//            return result
            return Arrays.stream(dp[n - 1]).min().asInt
        }
    }
}