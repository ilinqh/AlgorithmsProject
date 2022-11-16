package medium

class _775GlobalAndLocalInversions {
    class Solution {
        fun isIdealPermutation(nums: IntArray): Boolean {
            val n = nums.size
            var min = nums[n - 1]
            for (i in (n - 3) downTo 0) {
                if (nums[i] > min) {
                    return false
                }
                min = Math.min(min, nums[i + 1])
            }
            return true
        }
    }
}