package easy

class _268MissingNumber {
    class Solution {
        fun missingNumber(nums: IntArray): Int {
            var sum = nums.size
            for (i in nums.indices) {
                sum += i
                sum -= nums[i]
            }
            return sum
        }
    }

    class OtherSolution {
        fun missingNumber(nums: IntArray): Int {
            var sum = nums.size
            for (i in nums.indices) {
                sum = i xor nums[i] xor sum
            }
            return sum
        }
    }
}