package medium

class _31NextPermutation {
    class Solution {
        fun nextPermutation(nums: IntArray) {
            if (nums.size < 2) {
                return
            }
            var exchange = false
            out@ for (i in (nums.size - 1) downTo 1) {
                for (j in (i - 1) downTo 0) {
                    if (nums[i] > nums[j]) {
                        exchange = true
                        val temp = nums[j]
                        nums[j] = nums[i]
                        for (k in i until nums.size - 1) {
                            nums[k] = nums[k + 1]
                        }
                        nums[nums.size - 1] = temp
                        break@out
                    }
                }
            }
            if (!exchange) {
                for (i in 0 until (nums.size / 2)) {
                    val temp = nums[nums.size - i - 1]
                    nums[nums.size - i - 1] = nums[i]
                    nums[i] = temp
                }
            }
        }
    }
}