package medium

class _152MaximumProductSubarray {
    class Solution {
        fun maxProduct(nums: IntArray): Int {
            val length = nums.size
            var ans = nums[0]
            var maxF = nums[0]
            var minF = nums[0]
            for (i in 1 until length) {
                val tempMax = maxF
                val tempMin = minF
                maxF = Math.max(tempMax * nums[i], Math.max(tempMin * nums[i], nums[i]))
                minF = Math.min(tempMin * nums[i], Math.min(tempMax * nums[i], nums[i]))
                ans = Math.max(ans, maxF)
            }
            return ans
        }
    }
}