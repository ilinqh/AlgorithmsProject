package medium

class _54SpiralMatrix {
    class Solution {
        fun spiralOrder(matrix: Array<IntArray>): List<Int> {
            if (matrix.isEmpty()) {
                return emptyList()
            }
            val row = matrix.size
            val column = matrix[0].size
            val sum = row * column
            val result = ArrayList<Int>()

            var startRow = 0
            var startColumn = 0

            var endRow = row - 1
            var endColumn = column - 1

            var curRow = 0
            var curColumn = 0
            result.add(matrix[0][0])
            // 0: 向右, 1: 向下, 2: 向左, 3: 向上
            var nextDirection: Int = if (column > 1) {
                0
            } else {
                1
            }

            while (result.size < sum) {
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
                result.add(matrix[curRow][curColumn])
            }
            return result
        }
    }
}