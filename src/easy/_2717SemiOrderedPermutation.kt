package easy

class _2717SemiOrderedPermutation {
    class Solution {
        fun semiOrderedPermutation(nums: IntArray): Int {
            val firstIndex = nums.indexOf(1)
            val lastIndex = nums.indexOf(nums.size)
            if (firstIndex == 0 && lastIndex == nums.size - 1) {
                return 0
            }
            if (firstIndex < lastIndex) {
                return firstIndex + nums.size - 1 - lastIndex
            } else {
                return firstIndex + nums.size - 1 - lastIndex - 1
            }
        }
    }
}