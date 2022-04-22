package medium

import java.util.*

class _396RotateFunction {
    class Solution {
        fun maxRotateFunction(nums: IntArray): Int {
            val n = nums.size
            val sum = Arrays.stream(nums).sum()
            var last = 0
            for (i in 0 until n) {
                last += i * nums[i]
            }
            var ans = last
            for (i in 1 until n) {
                last = last + sum - n * nums[n - i]
                ans = Math.max(last, ans)
            }
            return ans
        }
    }
}