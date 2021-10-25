package medium

class _240SearchA2dMatrixIi {
    class Solution {
        fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
            val row = matrix.size
            val column = matrix[0].size
            var x = 0
            var y = column - 1
            while (x < row && y >= 0) {
                val num = matrix[x][y]
                if (num == target) {
                    return true
                } else if (num > target) {
                    y -= 1
                } else {
                    x += 1
                }
            }
            return false
        }
    }
}