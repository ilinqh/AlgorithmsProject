class EightQueenSolution {
    private lateinit var result: IntArray
    private val resultList = ArrayList<ArrayList<String>>()

    fun solveNQueens(n: Int): List<List<String>> {
        result = IntArray(n)

        cal8queen(0)
        return resultList
    }

    private fun cal8queen(row: Int) {
        if (row == result.size) {
            printQueens()
        }
        for (column in result.indices) {
            if (isOk(row, column)) {
                result[row] = column
                cal8queen(row + 1)
            }
        }
    }

    private fun isOk(row: Int, column: Int): Boolean {
        var leftUp = column - 1
        var rightUp = column + 1
        for (i in (row - 1) downTo 0) {
            if (result[i] == column) {
                return false
            }
            if (leftUp >= 0) {
                if (result[i] == leftUp) {
                    return false
                }
            }
            if (rightUp < result.size) {
                if (result[i] == rightUp) {
                    return false
                }
            }
            --leftUp
            ++rightUp
        }
        return true
    }

    private fun printQueens() {
        val queue = ArrayList<String>()
        val sb = StringBuffer()
        for (row in result.indices) {
            for (column in result.indices) {
                if (result[row] == column) {
                    sb.append("Q")
                } else {
                    sb.append(".")
                }
            }
            queue.add(sb.toString())
            sb.setLength(0)
        }
        resultList.add(queue)
    }
}


// leet code 最优解

class BestSolution {
    lateinit var chess: Array<IntArray>
    var rowBit: Long = 0L
    var colBit: Long = 0L
    var stTopBit: Long = 0L
    var endTopBit: Long = 0L
    val ans = ArrayDeque<List<String>>()
    fun solveNQueens(n: Int): List<List<String>> {
        chess = Array(n) { IntArray(n) }

        backTrack(0, 0, n, 0)
        return ans.toList()
    }

    private fun backTrack(oldi: Int, oldj: Int, n: Int, chessCount: Int) {
        if (chessCount == n) {
            chessAns()
            return
        }
        var j = oldj
        for (i in oldi until n) {
            while (j < n) {
                if (canChessBit(i, j, n)) {
                    chessValueBit(i, j, n, true)
                    backTrack(i + 1, 0, n, chessCount + 1)
                    chessValueBit(i, j, n, false)
                }
                j++
            }
            j = 0
        }
    }

    private fun chessValueBit(i: Int, j: Int, n: Int, chess: Boolean) {
        if (chess) {
            rowBit = rowBit or (1L shl (i))
            colBit = colBit or (1L shl (j))
            stTopBit = stTopBit or (1L shl (j - i + n - 1))
            endTopBit = endTopBit or (1L shl (i + j))
            this.chess[i][j] = 1
        } else {
            rowBit = rowBit xor (rowBit and (1L shl (i)))
            colBit = colBit xor (colBit and (1L shl (j)))
            stTopBit = stTopBit xor (stTopBit and (1L shl (j - i + n - 1)))
            endTopBit = endTopBit xor (endTopBit and (1L shl (i + j)))
            this.chess[i][j] = 0
        }
    }

    private fun chessAns() {
        val sb = StringBuffer()
        val queue = ArrayDeque<String>()
        for (i in chess.indices) {
            for (j in chess[0].indices) {
                sb.append(if (chess[i][j] == 1) "Q" else ".")
            }
            queue.add(sb.toString())
            sb.delete(0, sb.length)
        }
        ans.add(queue.toList())
    }

    private fun canChessBit(i: Int, j: Int, n: Int): Boolean {
        return (rowBit shr i) and 1L == 0L &&
                (colBit shr j) and 1L == 0L &&
                (stTopBit shr (j - i + n - 1)) and 1L == 0L &&
                (endTopBit shr (i + j)) and 1L == 0L
    }
}