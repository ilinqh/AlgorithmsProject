package medium

class _74SearchA2DMatrix {
    class Solution {
        fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
            val rowCount = matrix.size
            val columnCount = matrix[0].size
            var low = 0
            var high = rowCount * columnCount - 1
            while (low <= high) {
                val middle = low + ((high - low) shr 1)
                val item = matrix[middle / columnCount][middle % columnCount]
                if (item == target) {
                    return true
                } else if (item > target) {
                    high = middle - 1
                } else {
                    low = middle + 1
                }
            }
            return false
        }
    }
}