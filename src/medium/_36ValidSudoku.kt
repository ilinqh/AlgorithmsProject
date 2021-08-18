package medium

class _36ValidSudoku {
    class Solution {
        fun isValidSudoku(board: Array<CharArray>): Boolean {
            val rows = Array(9) { HashMap<Int, Int>(9) }
            val columns = Array(9) { HashMap<Int, Int>(9) }
            val boxes = Array(9) { HashMap<Int, Int>(9) }
            for (i in 0 until 9) {
                for (j in 0 until 9) {
                    val c = board[i][j]
                    if (c != '.') {
                        val boxIndex = (i / 3) * 3 + (j / 3)
                        val num = c.digitToInt()

                        rows[i][num] = rows[i].getOrDefault(num, 0) + 1
                        columns[j][num] = columns[j].getOrDefault(num, 0) + 1
                        boxes[boxIndex][num] = boxes[boxIndex].getOrDefault(num, 0) + 1

                        if (rows[i][num]!! > 1 || columns[j][num]!! > 1 || boxes[boxIndex][num]!! > 1) {
                            return false
                        }
                    }
                }
            }
            return true
        }
    }
}