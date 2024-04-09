package easy

class _2529MaximumCountOfPositiveIntegerAndNegativeInteger {
    class Solution {
        fun maximumCount(nums: IntArray): Int {
            val pos1 = lowerBound(nums, 0)
            val pos2 = lowerBound(nums, 1)
            return Math.max(pos1, nums.size - pos2)
        }

        private fun lowerBound(nums: IntArray, bound: Int): Int {
            var left = 0
            var right = nums.size
            while (left < right) {
                val middle = (right + left) / 2
                if (nums[middle] >= bound) {
                    right = middle
                } else {
                    left = middle + 1
                }
            }
            return left
        }
    }
}