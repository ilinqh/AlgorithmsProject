package medium

class _238ProductOfArrayExceptSelf {
    class Solution {
        fun productExceptSelf(nums: IntArray): IntArray {
            val length = nums.size
            val answer = IntArray(length)
            answer[0] = 1
            for (i in 1 until nums.size) {
                answer[i] = answer[i - 1] * nums[i - 1]
            }
            var right = 1
            for (i in (nums.size - 1) downTo 0) {
                answer[i] = answer[i] * right
                right *= nums[i]
            }
            return answer
        }
    }
}