package medium

class _34FindFirstAndLastPositionOfElementInSortedArray {
    class Solution {
        fun searchRange(nums: IntArray, target: Int): IntArray {
            if (nums.isEmpty()) {
                return intArrayOf(-1, -1)
            }
            val length = nums.size - 1
            val first = findFirstIndex(nums, length, target)
            val last = findLastIndex(nums, first, length, target)

            return intArrayOf(first, last)
        }

        private fun findFirstIndex(nums: IntArray, length: Int, target: Int): Int {
            var left = 0
            var right = length
            while (left <= right) {
                val middle = left + ((right - left) shr 1)
                if (nums[middle] > target) {
                    right = middle - 1
                } else if (nums[middle] < target) {
                    left = middle + 1
                } else {
                    if ((middle == 0) || nums[middle - 1] != target) {
                        return middle
                    } else {
                        right = middle - 1
                    }
                }
            }
            return -1
        }

        private fun findLastIndex(nums: IntArray, first: Int, length: Int, target: Int): Int {
            if (first < 0) {
                return -1
            }
            var left = first
            var right = length
            while (left <= right) {
                val middle = left + ((right - left) shr 1)
                if (nums[middle] > target) {
                    right = middle - 1
                } else if (nums[middle] < target) {
                    left = middle + 1
                } else {
                    if ((middle == length) || nums[middle + 1] != target) {
                        return middle
                    } else {
                        left = middle + 1
                    }
                }
            }
            return -1
        }
    }
}