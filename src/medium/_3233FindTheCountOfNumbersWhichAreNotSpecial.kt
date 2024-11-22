package medium

class _3233FindTheCountOfNumbersWhichAreNotSpecial {
    class Solution {
        fun nonSpecialCount(l: Int, r: Int): Int {
            var result = r - l + 1
            val n = Math.sqrt(r.toDouble()).toInt()
            val v = IntArray(n + 1)
            for (i in 2..n) {
                if (v[i] == 0) {
                    if (i * i in l..r) {
                        result -= 1
                    }
                    var j = i * 2
                    while (j <= n) {
                        v[j] = 1
                        j += i
                    }
                }
            }
            return result
        }
    }
}