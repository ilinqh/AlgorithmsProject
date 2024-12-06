package easy

class _999AvailableCapturesForRook {
    class Solution {
        fun numRookCaptures(board: Array<CharArray>): Int {
            var result = 0
            var st = 0
            var ed = 0
            for (i in board.indices) {
                for (j in board.first().indices) {
                    if (board[i][j] == 'R') {
                        st = i
                        ed = j
                        break
                    }
                }
            }
            val dx = intArrayOf(0, 1, 0, -1)
            val dy = intArrayOf(1, 0, -1, 0)
            for (i in 0 until 4) {
                for (j in 1 until 8) {
                    val tx = st + j * dx[i]
                    val ty = ed + j * dy[i]
                    if (tx < 0 || tx >= 8 || ty < 0 || ty >= 8 || board[tx][ty] == 'B') {
                        break
                    }
                    if (board[tx][ty] == 'p') {
                        result += 1
                        break
                    }
                }
            }
            return result
        }
    }
}