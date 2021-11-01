package medium

class _1861RotatingTheBox {
    class Solution {
        fun rotateTheBox(box: Array<CharArray>): Array<CharArray> {
            val row = box.size
            val column = box[0].size
            var last: Int
            for (i in 0 until row) {
                last = column - 1
                for (j in (column - 1) downTo 0) {
                    if (box[i][j] == '*') {
                        last = j - 1
                    } else if (box[i][j] == '#') {
                        if (last > j) {
                            box[i][last] = '#'
                            box[i][j] = '.'
                            last -= 1
                        } else {
                            last = j - 1
                        }
                    }
                }
            }
            val result = Array(column) { CharArray(row) }
            for (j in 0 until column) {
                for (i in 0 until row) {
                    result[j][i] = box[row - 1 - i][j]
                }
            }
            return result
        }
    }
}