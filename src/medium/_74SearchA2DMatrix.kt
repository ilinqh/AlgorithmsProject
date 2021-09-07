package medium

class _74SearchA2DMatrix {
    class Solution {
        fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
            val rowCount = matrix.size
            val columnCount = matrix[0].size
            var top = 0
            var bottom = rowCount - 1
            var left = 0
            var right = columnCount - 1
            while (top <= bottom) {
                val middleRow = top + (bottom - top) shr 1
                if (matrix[middleRow][0] > target) {
                    bottom = middleRow - 1
                }
            }
            return false
        }

        private fun searchInRow() {

        }
    }
}