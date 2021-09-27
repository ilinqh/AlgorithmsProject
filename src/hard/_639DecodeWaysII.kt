package hard

class _639DecodeWaysII {
    /**
     * 动态规划的思路，只是这道题只需要记录三个数据，因此不需要动态数组
     */
    class Solution {
        private val MOD = 1000000007
        fun numDecodings(s: String): Int {
            val n = s.length
            var a = 0L
            var b = 1L
            var c = 0L
            for (i in 1..n) {
                c = b * check1Digit(s[i - 1]) % MOD
                if (i > 1) {
                    c = (c + a * check2Digits(s[i - 2], s[i - 1])) % MOD
                }
                a = b
                b = c
            }
            return c.toInt()
        }

        private fun check1Digit(ch: Char): Int {
            return when (ch) {
                '0' -> {
                    0
                }
                '*' -> {
                    9
                }
                else -> {
                    1
                }
            }
        }

        private fun check2Digits(ch0: Char, ch1: Char): Int {
            return if (ch0 == '*' && ch1 == '*') {
                15
            } else if (ch0 == '*') {
                if (ch1 <= '6') {
                    2
                } else {
                    1
                }
            } else if (ch1 == '*') {
                when (ch0) {
                    '1' -> {
                        9
                    }
                    '2' -> {
                        6
                    }
                    else -> {
                        0
                    }
                }
            } else if (ch0 != '0' && (ch0 - '0') * 10 + (ch1 - '0') <= 26) {
                1
            } else {
                0
            }
        }
    }
}