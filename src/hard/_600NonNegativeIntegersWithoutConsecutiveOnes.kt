package hard

class _600NonNegativeIntegersWithoutConsecutiveOnes {
    class Solution {
        fun findIntegers(n: Int): Int {
            val dp = IntArray(31)
            dp[0] = 1
            dp[1] = 1
            for (i in 2 until 31) {
                dp[i] = dp[i - 1] + dp[i - 2]
            }
            var pre = 0
            var res = 0
            var tempN = n
            for (i in 29 downTo 0) {
                val value = 1 shl i
                if ((tempN and value) != 0) {
                    tempN -= value
                    res += dp[i + 1]
                    if (pre == 1) {
                        break
                    }
                    pre = 1
                } else {
                    pre = 0
                }
                if (i == 0) {
                    res += 1
                }
            }
            return res
        }
    }
}