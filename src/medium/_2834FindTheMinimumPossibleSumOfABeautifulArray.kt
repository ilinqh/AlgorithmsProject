package medium

class _2834FindTheMinimumPossibleSumOfABeautifulArray {
    class Solution {
        fun minimumPossibleSum(n: Int, target: Int): Int {
            val mod = (1e9 + 7).toInt()
            val m = target / 2
            if (n <= m) {
                return (((1L + n) * n / 2) % mod).toInt()
            }
            return ((((1L + m) * m / 2) + (target.toLong() + target + (n - m - 1)) * (n - m) / 2) % mod).toInt()
        }
    }
}