package medium

class _80RemoveDuplicatesFromSortedArrayII {
    class Solution {
        fun removeDuplicates(nums: IntArray): Int {
            if (nums.size == 1) {
                return 1
            }
            var left = 0
            var right = left + 1
            var repeat = false
            while (right < nums.size) {
                if (nums[right] == nums[left]) {
                    if (!repeat) {
                        left += 1
                        nums[left] = nums[right]
                    }
                    repeat = true
                } else {
                    left += 1
                    nums[left] = nums[right]
                    repeat = false
                }
                right += 1
            }
            return left + 1
        }
    }
}