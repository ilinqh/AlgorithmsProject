package medium

class _357CountNumbersWithUniqueDigits {
    class Solution {
        fun countNumbersWithUniqueDigits(n: Int): Int {
            if (n == 0) {
                return 1
            }
            if (n == 1) {
                return 10
            }
            var res = 10
            var cur = 9
            for (i in 0 until (n - 1)) {
                cur *= (9 - i)
                res += cur
            }
            return res
        }
    }
}