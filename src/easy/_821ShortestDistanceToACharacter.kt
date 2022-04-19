package easy

class _821ShortestDistanceToACharacter {
    class Solution {
        fun shortestToChar(s: String, c: Char): IntArray {
            val n = s.length
            val ans = IntArray(n)
            var idx = -n
            for (i in 0 until n) {
                if (s[i] == c) {
                    idx = i
                }
                ans[i] = i - idx
            }
            idx = 2 * n
            for (i in (n - 1) downTo 0) {
                if (s[i] == c) {
                    idx = i
                }
                ans[i] = Math.min(ans[i], idx - i)
            }
            return ans
        }
    }
}