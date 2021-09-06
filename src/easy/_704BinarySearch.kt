package easy

class _704BinarySearch {
    class Solution {
        fun search(nums: IntArray, target: Int): Int {
            var left = 0
            var right = nums.size - 1
            while (left <= right) {
                val middle = left + ((right - left) shr 1)
                if (nums[middle] == target) {
                    return middle
                }
                if (nums[middle] > target) {
                    right = middle - 1
                } else {
                    left = middle + 1
                }
            }
            return -1
        }
    }
}