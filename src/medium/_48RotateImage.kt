package medium

class _48RotateImage {
    class Solution {
        fun rotate(matrix: Array<IntArray>) {
            val length = matrix.size
            val maxRow = length / 2
            for (i in 0 until maxRow) {
                val maxColumn = length - i - 1
                for (j in i until maxColumn) {
                    swap(i, j, length, matrix)
                }
            }
        }

        private fun swap(row: Int, column: Int, length: Int, matrix: Array<IntArray>) {
            val temp = matrix[row][column]
            matrix[row][column] = matrix[length - column - 1][row]
            matrix[length - column - 1][row] = matrix[length - row - 1][length - column - 1]
            matrix[length - row - 1][length - column - 1] = matrix[column][length - row - 1]
            matrix[column][length - row - 1] = temp
        }
    }
}