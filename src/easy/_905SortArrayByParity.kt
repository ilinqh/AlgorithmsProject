package easy

class _905SortArrayByParity {
    class Solution {
        fun sortArrayByParity(nums: IntArray): IntArray {
            val n = nums.size
            var left = 0
            var right = n - 1
            while (left < right) {
                while (nums[left] % 2 == 0 && left < right) {
                    left += 1
                }
                while (nums[right] % 2 != 0 && right > left) {
                    right -= 1
                }
                if (left < right && nums[left] % 2 != 0 && nums[right] % 2 == 0) {
                    swap(nums, left, right)
                }
            }
            return nums
        }

        private fun swap(nums: IntArray, left: Int, right: Int) {
            val temp = nums[left]
            nums[left] = nums[right]
            nums[right] = temp
        }
    }
}