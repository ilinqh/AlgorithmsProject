package easy

class _2016MaximumDifferenceBetweenIncreasingElements {
    class Solution {
        fun maximumDifference(nums: IntArray): Int {
            var ans = 0
            var minIndex = 0
            for (i in 1 until nums.size) {
                if (nums[i] > nums[minIndex]) {
                    ans = Math.max(ans, nums[i] - nums[minIndex])
                } else {
                    minIndex = i
                }
            }
            return if (ans == 0) {
                -1
            } else {
                ans
            }
        }
    }
}