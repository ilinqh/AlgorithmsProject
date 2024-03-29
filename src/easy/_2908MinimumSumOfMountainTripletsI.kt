package easy

class _2908MinimumSumOfMountainTripletsI {
    class Solution {
        fun minimumSum(nums: IntArray): Int {
            var result = 151
            var mn = 151
            val left = IntArray(nums.size)
            for (i in 1 until nums.size) {
                left[i] = Math.min(mn, nums[i - 1])
                mn = left[i]
            }
            var right = nums.last()
            for (i in nums.size - 1 downTo 1) {
                if (left[i] < nums[i] && right < nums[i]) {
                    result = Math.min(result, left[i] + nums[i] + right)
                }
                right = Math.min(right, nums[i])
            }
            return if (result < 151) {
                result
            } else {
                -1
            }
        }
    }
}