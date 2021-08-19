package hard

class _52EightQueenII {
    class Solution {
        private lateinit var resultArray: IntArray
        private var result: Int = 0

        fun totalNQueens(n: Int): Int {
            resultArray = IntArray(n)
            cal8queen(0)
            return result
        }

        private fun cal8queen(row: Int) {
            if (row == resultArray.size) {
                result++
            }
            for (column in resultArray.indices) {
                if (isOk(row, column)) {
                    resultArray[row] = column
                    cal8queen(row + 1)
                }
            }
        }

        private fun isOk(row: Int, column: Int): Boolean {
            var leftUp = column - 1
            var rightUp = column + 1
            for (i in (row - 1) downTo 0) {
                if (resultArray[i] == column) {
                    return false
                }
                if (leftUp >= 0) {
                    if (resultArray[i] == leftUp) {
                        return false
                    }
                }
                if (rightUp < resultArray.size) {
                    if (resultArray[i] == rightUp) {
                        return false
                    }
                }
                --leftUp
                ++rightUp
            }
            return true
        }
    }
}