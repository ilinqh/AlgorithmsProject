package medium

class _2661FirstCompletelyPaintedRowOrColumn {
    class Solution {
        fun firstCompleteIndex(arr: IntArray, mat: Array<IntArray>): Int {
            val n = mat.size
            val m = mat.first().size
            val map = HashMap<Int, IntArray>()
            for (i in 0 until n) {
                for (j in 0 until m) {
                    map[mat[i][j]] = intArrayOf(i, j)
                }
            }
            val rowCnt = IntArray(n)
            val colCnt = IntArray(m)
            for (i in arr.indices) {
                val temp = map[arr[i]]!!
                rowCnt[temp[0]] += 1
                if (rowCnt[temp[0]] == m) {
                    return i
                }
                colCnt[temp[1]] += 1
                if (colCnt[temp[1]] == n) {
                    return i
                }
            }
            return -1
        }
    }
}