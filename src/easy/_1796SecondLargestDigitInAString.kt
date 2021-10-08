package easy

class _1796SecondLargestDigitInAString {
    class Solution {
        fun secondHighest(s: String): Int {
            var a = -1
            var b = -1
            for (i in s.indices) {
                val ch = s[i]
                if (Character.isDigit(ch)) {
                    val num = ch - '0'
                    if (num > b) {
                        a = b
                        b = num
                    } else if (num > a && num != b) {
                        a = num
                    }
                }
            }
            return if (a == b) {
                -1
            } else {
                a
            }
        }
    }
}