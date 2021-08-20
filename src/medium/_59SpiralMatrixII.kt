package medium

class _59SpiralMatrixII {
class Solution {
    fun generateMatrix(n: Int): Array<IntArray> {
        val result = Array(n) {
            IntArray(n)
        }
        result[0][0] = 1
        var startRow = 0
        var startColumn = 0

        var endRow = n - 1
        var endColumn = n - 1

        var curRow = 0
        var curColumn = 0

        // 0: 向右, 1: 向下, 2: 向左, 3: 向上
        var nextDirection = 0

        for (i in 1 until (n * n)) {
            when (nextDirection) {
                0 -> {
                    nextDirection = if (curColumn < endColumn) {
                        curColumn++
                        0
                    } else {
                        startRow++
                        curRow++
                        1
                    }
                }
                1 -> {
                    nextDirection = if (curRow < endRow) {
                        curRow++
                        1
                    } else {
                        endColumn--
                        curColumn--
                        2
                    }
                }
                2 -> {
                    nextDirection = if (curColumn > startColumn) {
                        curColumn--
                        2
                    } else {
                        curRow--
                        endRow--
                        3
                    }
                }
                3 -> {
                    nextDirection = if (curRow > startRow) {
                        curRow--
                        3
                    } else {
                        curColumn++
                        startColumn++
                        0
                    }
                }
            }
            result[curRow][curColumn] = i + 1
        }
        return result
    }
}
}