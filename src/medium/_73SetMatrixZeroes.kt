package medium

class _73SetMatrixZeroes {
    class Solution {
        fun setZeroes(matrix: Array<IntArray>) {
            val rowCount = matrix.size
            val columnCount = matrix[0].size
            val needChangeRow = BooleanArray(rowCount)
            val needChangeColumn = BooleanArray(columnCount)
            for (i in 0 until rowCount) {
                for (j in 0 until columnCount) {
                    if (matrix[i][j] == 0) {
                        needChangeRow[i] = true
                        needChangeColumn[j] = true
                    }
                }
            }
            for (row in 0 until rowCount) {
                for (column in 0 until columnCount) {
                    if (needChangeRow[row] || needChangeColumn[column]) {
                        matrix[row][column] = 0
                    }
                }
            }
        }
    }

    class BestSolution {
        fun setZeroes(matrix: Array<IntArray>) {
            val rowCount = matrix.size
            val columnCount = matrix[0].size
            var row0 = false
            var column0 = false
            for (column in 0 until columnCount) {
                if (matrix[0][column] == 0) {
                    row0 = true
                    break
                }
            }
            for (row in 0 until rowCount) {
                if (matrix[row][0] == 0) {
                    column0 = true
                    break
                }
            }
            for (row in 1 until rowCount) {
                for (column in 1 until columnCount) {
                    if (matrix[row][column] == 0) {
                        matrix[row][0] = 0
                        matrix[0][column] = 0
                    }
                }
            }
            for (row in 1 until rowCount) {
                for (column in 1 until columnCount) {
                    if (matrix[row][0] == 0 || matrix[0][column] == 0) {
                        matrix[row][column] = 0
                    }
                }
            }
            if (row0) {
                for (column in 0 until columnCount) {
                    matrix[0][column] = 0
                }
            }

            if (column0) {
                for (row in 0 until rowCount) {
                    matrix[row][0] = 0
                }
            }
            print("")
        }
    }
}