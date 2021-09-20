package medium

class _650TwoKeysKeyboard {
    class Solution {
        fun minSteps(n: Int): Int {
            val dp = IntArray(n + 1)
            for (i in 2..n) {
                dp[i] = Int.MAX_VALUE
                var j = 1
                while (j * j <= i) {
                    if (i % j == 0) {
                        dp[i] = Math.min(dp[i], dp[j] + i / j)
                        dp[i] = Math.min(dp[i], dp[i / j] + j)
                    }
                    j += 1
                }
            }
            return dp[n]
        }
    }

    class BestSolution {
        fun minSteps(n: Int): Int {
            var ans = 0
            var i = 2
            var tempN = n
            while (i * i <= tempN) {
                while (tempN % i == 0) {
                    tempN /= i
                    ans += i
                }
                i += 1
            }
            if (tempN > 1) {
                ans += tempN
            }
            return ans
        }
    }

}