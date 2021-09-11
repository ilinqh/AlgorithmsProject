package medium

class _81SearchInRotatedSortedArrayII {
    class Solution {
        fun search(nums: IntArray, target: Int): Boolean {
            val length = nums.size
            if (length == 0) {
                return false
            }
            if (length == 1) {
                return nums[0] == target
            }
            var left = 0
            var right = length - 1
            while (left <= right) {
                val middle = left + ((right - left) shr 1)
                if (nums[middle] == target) {
                    return true
                }
                if (nums[left] == nums[middle] && nums[middle] == nums[right]) {
                    left += 1
                    right -= 1
                } else if (nums[left] <= nums[middle]) {
                    if (nums[left] <= target && target < nums[middle]) {
                        right = middle - 1
                    } else {
                        left = middle + 1
                    }
                } else {
                    if (nums[middle] < target && target <= nums[length - 1]) {
                        left = middle + 1
                    } else {
                        right = middle - 1
                    }
                }
            }
            return false
        }
    }
}