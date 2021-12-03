package easy

import java.util.*

class _1005MaximizeSumOfArrayAfterKNegations {
    class Solution {
        fun largestSumAfterKNegations(nums: IntArray, k: Int): Int {
            var tempK = k
            val freq = HashMap<Int, Int>()
            for (i in nums.indices) {
                freq[nums[i]] = freq.getOrDefault(nums[i], 0) + 1
            }
            var ans = Arrays.stream(nums).sum()
            for (i in -100 until 0) {
                if (freq.containsKey(i)) {
                    val ops = Math.min(tempK, freq[i]!!)
                    ans += (-i) * ops * 2
                    freq[i] = freq[i]!! - ops
                    freq[-i] = freq.getOrDefault(-i, 0) + ops
                    tempK -= ops
                    if (tempK == 0) {
                        break
                    }
                }
            }
            if (tempK > 0 && tempK % 2 == 1 && !freq.containsKey(0)) {
                for (i in 1..100) {
                    if (freq.containsKey(i)) {
                        ans -= i * 2
                        break
                    }
                }
            }
            return ans
        }
    }
}