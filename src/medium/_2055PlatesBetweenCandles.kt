package medium

class _2055PlatesBetweenCandles {
    class Solution {
        fun platesBetweenCandles(s: String, queries: Array<IntArray>): IntArray {
            val length = s.length
            val preSum = IntArray(length)
            var sum = 0
            for (i in 0 until length) {
                if (s[i] == '*') {
                    sum += 1
                }
                preSum[i] = sum
            }
            val left = IntArray(length)
            var l = -1
            for (i in 0 until length) {
                if (s[i] == '|') {
                    l = i
                }
                left[i] = l
            }
            val right = IntArray(length)
            var r = -1
            for (i in (length - 1) downTo 0) {
                if (s[i] == '|') {
                    r = i
                }
                right[i] = r
            }
            val ans = IntArray(queries.size)
            for (i in queries.indices) {
                val query = queries[i]
                val x = right[query[0]]
                val y = left[query[1]]
                ans[i] = if (x == -1 || y == -1 || x >= y) {
                    0
                } else {
                    preSum[y] - preSum[x]
                }
            }
            return ans
        }
    }
}