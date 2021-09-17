package medium

class _36ValidSudoku {
    class HashMapSolution {
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

    class ArraySolution {
        fun isValidSudoku(board: Array<CharArray>): Boolean {
            val rows = Array(10) { BooleanArray(10) }
            val columns = Array(10) { BooleanArray(10) }
            val boxes = Array(10) { BooleanArray(10) }
            for (i in 0 until 9) {
                for (j in 0 until 9) {
                    val c = board[i][j]
                    if (c != '.') {
                        val boxIndex = (i / 3) * 3 + (j / 3)
                        val num = c - '0'
                        if (rows[i][num] || columns[j][num] || boxes[boxIndex][num]) {
                            return false
                        }
                        rows[i][num] = true
                        columns[j][num] = true
                        boxes[boxIndex][num] = true
                    }
                }
            }
            return true
        }
    }

    class Solution {
        fun isValidSudoku(board: Array<CharArray>): Boolean {
            val row = IntArray(10)
            val col = IntArray(10)
            val area = IntArray(10)
            for (i in 0 until 9) {
                for (j in 0 until 9) {
                    val ch = board[i][j]
                    if (ch != '.') {
                        val num = ch - '0'
                        val index = i / 3 * 3 + j / 3
                        if (((row[i] shr num) and 1) == 1 ||
                            ((col[j] shr num) and 1) == 1 ||
                            ((area[index] shr num) and 1) == 1
                        ) {
                            return false
                        }
                        row[i] = row[i] or (1 shl num)
                        col[j] = col[j] or (1 shl num)
                        area[index] = area[index] or (1 shl num)
                    }
                }
            }
            return true
        }
    }
}