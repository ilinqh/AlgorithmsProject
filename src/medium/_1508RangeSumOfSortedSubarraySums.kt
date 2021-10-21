package medium

class _1508RangeSumOfSortedSubarraySums {
    class Solution {
        private val MODULO = 1000000007
        fun rangeSum(nums: IntArray, n: Int, left: Int, right: Int): Int {
            val prefixSums = IntArray(n + 1) { 0 }
            for (i in 0 until n) {
                prefixSums[i + 1] = prefixSums[i] + nums[i]
            }
            val prefixPrefixSums = IntArray(n + 1)
            for (i in 0 until n) {
                prefixPrefixSums[i + 1] = prefixPrefixSums[i] + prefixSums[i + 1]
            }
            return (getSum(prefixSums, prefixPrefixSums, n, right) -
                    getSum(prefixSums, prefixPrefixSums, n, left - 1)
                    ) % MODULO
        }

        private fun getSum(prefixSums: IntArray, prefixPrefixSums: IntArray, n: Int, k: Int): Int {
            val num = getKth(prefixSums, n, k)
            var sum = 0
            var count = 0
            for (i in 0 until n) {
                var j = 1
                while (j <= n && prefixSums[j] - prefixSums[i] < num) {
                    j += 1
                }
                j -= 1
                sum = (sum + prefixPrefixSums[j] - prefixPrefixSums[i] - prefixSums[i] * (j - i)) % MODULO
                count += j - i
            }
            sum = (sum + num * (k - count)) % MODULO
            return sum
        }

        private fun getKth(prefixSums: IntArray, n: Int, k: Int): Int {
            var low = 0
            var high = prefixSums[n]
            while (low < high) {
                val middle = ((high - low) shr 1) + low
                val count = getCount(prefixSums, n, middle)
                if (count < k) {
                    low = middle + 1
                } else {
                    high = middle
                }
            }
            return low
        }

        private fun getCount(prefixSums: IntArray, n: Int, x: Int): Int {
            var count = 0
            var j = 1
            for (i in 0 until n) {
                while (j <= n && prefixSums[j] - prefixSums[i] <= x) {
                    j += 1
                }
                j -= 1
                count += j - i
            }
            return count
        }
    }
}