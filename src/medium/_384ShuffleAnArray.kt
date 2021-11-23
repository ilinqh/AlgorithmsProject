package medium

import java.util.*

class _384ShuffleAnArray {
    class Solution(val nums: IntArray) {
        private val original = IntArray(nums.size)

        init {
            System.arraycopy(nums, 0, original, 0, nums.size)
        }

        fun reset(): IntArray {
            System.arraycopy(nums, 0, original, 0, nums.size)
            return nums
        }

        fun shuffle(): IntArray {
            val random = Random()
            for (i in nums.indices) {
                val j = i + random.nextInt(nums.size - i)
                val temp = nums[i]
                nums[i] = nums[j]
                nums[j] = temp
            }
            return nums
        }

    }
}