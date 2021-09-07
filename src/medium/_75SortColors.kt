package medium

class _75SortColors {
    class Solution {
        fun sortColors(nums: IntArray): Unit {
            var p = 0
            var q = nums.size - 1
            for (i in nums.indices) {
                while (i <= q && nums[i] == 2) {
                    swap(nums, i, q)
                    --q
                }
                if (nums[i] == 0) {
                    swap(nums, i, p)
                    ++p
                }
            }
        }

        private fun swap(nums: IntArray, p: Int, q: Int) {
            val temp = nums[p]
            nums[p] = nums[q]
            nums[q] = temp
        }
    }
}