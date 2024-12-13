package easy

class _3264FinalArrayStateAfterKMultiplicationOperationsI {
    class Solution {
        fun getFinalState(nums: IntArray, k: Int, multiplier: Int): IntArray {
            for (i in 0 until k) {
                var minIndex = 0
                for (j in nums.indices) {
                    if (nums[j] < nums[minIndex]) {
                        minIndex = j
                    }
                }
                nums[minIndex] *= multiplier
            }
            return nums
        }
    }
}