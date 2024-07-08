package easy

class _3033ModifyTheMatrix {
    class Solution {
        fun modifiedMatrix(matrix: Array<IntArray>): Array<IntArray> {
            val row = matrix.size
            val column = matrix.first().size
            for (j in 0 until column) {
                var temp = -1
                for (i in 0 until row) {
                    temp = Math.max(temp, matrix[i][j])
                }
                for (i in 0 until row) {
                    if (matrix[i][j] == -1) {
                        matrix[i][j] = temp
                    }
                }
            }
            return matrix
        }
    }
}