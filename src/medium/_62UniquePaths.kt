package medium

class _62UniquePaths {
    class Solution {
        fun uniquePaths(m: Int, n: Int): Int {
            val map = IntArray(n) { 1 }
            for (i in 1 until m) {
                for (j in 1 until n) {
                    map[j] = map[j] + map[j - 1]
                }
            }
            return map[n - 1]
        }
    }
}