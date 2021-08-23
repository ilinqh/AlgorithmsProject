package easy

class _1646GetMaximumInGeneratedArray {
    class Solution {
        fun getMaximumGenerated(n: Int): Int {
            if (n == 0) {
                return 0
            }
            val nums = IntArray(n + 1)
            var max = 1
            nums[0] = 0
            nums[1] = 1
            for (i in 2..n) {
                nums[i] = nums[i / 2] + (i % 2) * nums[(i / 2) + 1]
                max = Math.max(max, nums[i])
            }
            return max
        }
    }
}