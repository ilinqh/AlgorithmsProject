package medium

class _130SurroundedRegions {
    class Solution {
        fun solve(board: Array<CharArray>) {
            val row = board.size
            if (row == 0) {
                return
            }
            val column = board[0].size
            for (i in 0 until row) {
                dfs(board, i, 0)
                dfs(board, i, column - 1)
            }
            for (i in 0 until column) {
                dfs(board, 0, i)
                dfs(board, row - 1, i)
            }
            for (i in 0 until row) {
                for (j in 0 until column) {
                    if (board[i][j] == 'A') {
                        board[i][j] = 'O'
                    } else if (board[i][j] == 'O') {
                        board[i][j] = 'X'
                    }
                }
            }
        }

        private fun dfs(board: Array<CharArray>, x: Int, y: Int) {
            if (x < 0 || x >= board.size || y < 0 || y >= board[0].size || board[x][y] != 'O') {
                return
            }
            board[x][y] = 'A'
            dfs(board, x - 1, y)
            dfs(board, x + 1, y)
            dfs(board, x, y - 1)
            dfs(board, x, y + 1)
        }
    }
}