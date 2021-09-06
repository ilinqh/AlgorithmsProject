package medium

class _50PowXN {
    class Solution {
        fun myPow(x: Double, n: Int): Double {
            val N: Long = n.toLong()
            return if (N >= 0) {
                quickMul(x, N)
            } else {
                1 / quickMul(x, -N)
            }
        }

        private fun quickMul(x: Double, N: Long): Double {
            var ans = 1.0
            var xContribute = x
            var n = N
            while (n > 0) {
                if (n % 2 == 1L) {
                    ans *= xContribute
                }
                xContribute *= xContribute
                n /= 2
            }
            return ans
        }
    }
}