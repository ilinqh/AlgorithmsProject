package medium

class _386LexicographicalNumbers {
    class Solution {
        fun lexicalOrder(n: Int): List<Int> {
            val ans = ArrayList<Int>()
            var cur = 1
            for (i in 0 until n) {
                ans.add(i, cur)
                if (cur * 10 <= n) {
                    cur *= 10
                } else {
                    while (cur % 10 == 9 || cur + 1 > n) {
                        cur /= 10
                    }
                    cur += 1
                }
            }
            return ans
        }
    }
}