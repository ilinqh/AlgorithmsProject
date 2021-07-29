class Solution {
    fun solveNQueens(n: Int): List<List<String>> {
        val result = IntArray(n)
        return cal8queen(result, 0)
    }
}

private fun cal8queen(result: IntArray, row: Int): ArrayList<ArrayList<String>> {
    val resultList = ArrayList<ArrayList<String>>()
    if (row == result.size) {
        resultList.add(printQueens(result))
    }
    for (column in result.indices) {
        if (isOk(result, row, column)) {
            result[row] = column
            val tempList = cal8queen(result, row + 1)
            if (tempList.isNotEmpty()) {
                resultList.addAll(tempList)
            }
        }
    }
    return resultList
}

private fun isOk(result: IntArray, row: Int, column: Int): Boolean {
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

private fun printQueens(result: IntArray): ArrayList<String> {
    val strList = arrayListOf<String>()
    val rowStr = StringBuffer()
    for (row in result.indices) {
        for (column in result.indices) {
            if (result[row] == column) {
                rowStr.append("Q")
            } else {
                rowStr.append(".")
            }
        }
        strList.add(rowStr.toString())
        rowStr.setLength(0)
    }
    return strList
}
