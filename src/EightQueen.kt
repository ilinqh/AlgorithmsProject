val result = IntArray(8)

fun main(args: Array<String>) {
    cal8queen(0)
}

private fun cal8queen(row: Int) {
    if (row == result.size) {
        printQueens()
        return
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
    for (row in result.indices) {
        for (column in result.indices) {
            if (result[row] == column) {
                print("Q ")
            } else {
                print("* ")
            }
        }
        println()
    }
    println("----------------")
}

