package medium

class _172FactorialTrailingZeroes {
    class Solution {
        fun trailingZeroes(n: Int): Int {
            return if (n == 0) {
                0
            } else {
                n / 5 + trailingZeroes(n / 5)
            }
        }
    }
}