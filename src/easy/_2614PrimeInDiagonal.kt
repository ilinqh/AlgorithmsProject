package easy

class _2614PrimeInDiagonal {
    class Solution {
        fun diagonalPrime(nums: Array<IntArray>): Int {
            var result = 0
            for (i in nums.indices) {
                if (isPrime(nums[i][i])) {
                    result = Math.max(result, nums[i][i])
                }
                if (isPrime(nums[i][nums.size - i - 1])) {
                    result = Math.max(result, nums[i][nums.size - i - 1])
                }
            }
            return result
        }

        private fun isPrime(num: Int): Boolean {
            if (num == 1) {
                return false
            }
            var factor = 2
            while (factor * factor <= num) {
                if (num % factor == 0) {
                    return false
                }
                factor += 1
            }
            return true
        }
    }
}