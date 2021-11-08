package medium

class _289GameOfLife {
    class Solution {
        fun gameOfLife(board: Array<IntArray>) {
            val neighbors = intArrayOf(-1, 0, 1)

            val rowCount = board.size
            val columnCount = board[0].size
            val copyBoard = Array(rowCount) { IntArray(columnCount) }
            for (row in 0 until rowCount) {
                for (column in 0 until columnCount) {
                    copyBoard[row][column] = board[row][column]
                }
            }

            for (row in 0 until rowCount) {
                for (column in 0 until columnCount) {
                    var liveCount = 0
                    for (i in 0 until 3) {
                        for (j in 0 until 3) {
                            if (!(neighbors[i] == 0 && neighbors[j] == 0)) {
                                val r = row + neighbors[i]
                                val c = column + neighbors[j]
                                if (r in 0 until rowCount && c in 0 until columnCount && copyBoard[r][c] == 1) {
                                    liveCount += 1
                                }
                            }
                        }
                    }

                    if (board[row][column] == 1 && (liveCount < 2 || liveCount > 3)) {
                        board[row][column] = 0
                    } else if (board[row][column] == 0 && liveCount == 3) {
                        board[row][column] = 1
                    }
                }
            }
        }
    }
}