package medium

class _91DecodeWays {
    class Solution {
        fun numDecodings(s: String): Int {
            val length = s.length
            var a = 0
            var b = 1
            var c = 0
            for (i in 1..length) {
                c = 0
                if (s[i - 1] != '0') {
                    c += b
                }
                if (i > 1 && s[i - 2] != '0' && ((s[i - 2] - '0') * 10 + (s[i - 1] - '0') <= 26)) {
                    c += a
                }
                a = b
                b = c
            }
            return c
        }
    }
}