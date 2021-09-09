package medium

class _79WordSearch {
    class Solution {
        fun exist(board: Array<CharArray>, word: String): Boolean {
            if (board.isEmpty()) {
                return false
            }
            val rowCount = board.size
            val columnCount = board[0].size
            val direction = arrayOf(intArrayOf(0, 1), intArrayOf(0, -1), intArrayOf(1, 0), intArrayOf(-1, 0))
            val visited = Array(rowCount) { BooleanArray(columnCount) }
            for (row in 0 until rowCount) {
                for (column in 0 until columnCount) {
                    if (board[row][column] != word[0]) {
                        continue
                    }
                    val flag = backtrace(board, visited, row, column, word, 0, direction)
                    if (flag) {
                        return true
                    }
                }
            }
            return false
        }

        private fun backtrace(
            board: Array<CharArray>,
            visited: Array<BooleanArray>,
            row: Int,
            column: Int,
            word: String,
            index: Int,
            directions: Array<IntArray>
        ): Boolean {
            if (board[row][column] != word[index] || visited[row][column]) {
                return false
            }
            if (index == word.length - 1) {
                return true
            }
            visited[row][column] = true
            for (direction in directions) {
                val newRow = row + direction[0]
                val newColumn = column + direction[1]
                if (newRow >= 0 && newRow < board.size && newColumn >= 0 && newColumn < board[0].size) {
                    val flag = backtrace(board, visited, newRow, newColumn, word, index + 1, directions)
                    if (flag) {
                        return true
                    }
                }
            }
            visited[row][column] = false
            return false
        }
    }
}