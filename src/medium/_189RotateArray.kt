package medium

class _189RotateArray {
    class Solution {
        fun rotate(nums: IntArray, k: Int) {
            val tempK = k % nums.size
            reverse(nums, 0, nums.size - 1)
            reverse(nums, 0, tempK - 1)
            reverse(nums, tempK, nums.size - 1)
        }

        private fun reverse(nums: IntArray, start: Int, end: Int) {
            var tempStart = start
            var tempEnd = end
            while (tempStart < tempEnd) {
                val temp = nums[tempEnd]
                nums[tempEnd] = nums[tempStart]
                nums[tempStart] = temp
                tempStart += 1
                tempEnd -= 1
            }
        }
    }
}