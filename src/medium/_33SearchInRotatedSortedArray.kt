package medium

class _33SearchInRotatedSortedArray {
    class Solution {
        fun search(nums: IntArray, target: Int): Int {
            if (nums.isEmpty()) {
                return -1
            }
            if (nums.size == 1) {
                return if (nums[0] == target) {
                    0
                } else {
                    -1
                }
            }
            // [4,5,6,7,0,1,2]
            // 0
            var left = 0
            var right = nums.size - 1
            while (left <= right) {
                val middle = left + (right - left) / 2
                if (nums[middle] == target) {
                    return middle
                }
                if (nums[0] < nums[middle]) {
                    if (nums[middle] < target) {
                        right = middle - 1
                    } else {
                        left = middle + 1
                    }
                } else {
                    if (nums[middle] < target) {
                        left = middle + 1
                    } else {
                        right = middle - 1
                    }
                }
            }
            return -1
        }
    }
}