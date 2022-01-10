package medium

class _390EliminationGame {
    class Solution {
        fun lastRemaining(n: Int): Int {
            var a1 = 1
            var k = 0
            var cnt = n
            var step = 1
            while (cnt > 1) {
                if (k % 2 == 0) {
                    a1 += step
                } else {
                    a1 = if (cnt % 2 == 0) {
                        a1
                    } else {
                        a1 + step
                    }
                }
                k += 1
                cnt = cnt shr 1
                step = step shl 1
            }
            return a1
        }
    }
}