package medium

class _162FindPeakElement {
    class Solution {
        fun findPeakElement(nums: IntArray): Int {
            val length = nums.size
            var left = 0
            var right = length - 1
            var ans = -1
            while (left <= right) {
                val middle = left + ((right - left) shr 1)
                if (compare(nums, middle - 1, middle) < 0 && compare(nums, middle, middle + 1) > 0) {
                    ans = middle
                    break
                }
                if (compare(nums, middle, middle + 1) < 0) {
                    left = middle + 1
                } else {
                    right = middle - 1
                }
            }
            return ans
        }

        private fun get(nums: IntArray, idx: Int): IntArray {
            if (idx == -1 || idx == nums.size) {
                return intArrayOf(0, 0)
            }
            return intArrayOf(1, nums[idx])
        }

        private fun compare(nums: IntArray, idx1: Int, idx2: Int): Int {
            val num1 = get(nums, idx1)
            val num2 = get(nums, idx2)
            if (num1[0] != num2[0]) {
                return if (num1[0] > num2[0]) {
                    1
                } else {
                    -1
                }
            }
            if (num1[1] == num2[1]) {
                return 0
            }
            return if (num1[1] > num2[1]) {
                1
            } else {
                -1
            }
        }
    }
}