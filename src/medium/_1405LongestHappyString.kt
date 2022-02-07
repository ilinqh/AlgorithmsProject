package medium

import java.util.*


class _1405LongestHappyString {
    class Solution {
        fun longestDiverseString(a: Int, b: Int, c: Int): String {
            val sb = StringBuilder()
            val arr = arrayOf(Pair(a, 'a'), Pair(b, 'b'), Pair(c, 'c'))

            while (true) {
                Arrays.sort(arr) { p1, p2 -> p2.freq - p1.freq }
                var hasNext = false
                for (pair in arr) {
                    if (pair.freq <= 0) {
                        break
                    }
                    val m = sb.length
                    if (m >= 2 && sb[m - 2] == pair.ch && sb[m - 1] == pair.ch) {
                        continue
                    }
                    hasNext = true
                    sb.append(pair.ch)
                    pair.freq -= 1
                    break
                }
                if (!hasNext) {
                    break
                }
            }

            return sb.toString()
        }

        class Pair(var freq: Int, var ch: Char)
    }
}