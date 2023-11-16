package easy

class _2760LongestEvenOddSubarrayWithThreshold {
    class Solution {
        fun longestAlternatingSubarray(nums: IntArray, threshold: Int): Int {
            var result = 0
            var currentResult = 0
            var flag = 0
            var startIndex = 0
            val length = nums.size
            while (startIndex < length) {
                if (nums[startIndex] % 2 != 0) {
                    startIndex += 1
                    continue
                }
                currentResult = 0
                flag = 1
                while (startIndex < length) {
                    if (nums[startIndex] > threshold) {
                        startIndex += 1
                        break
                    }
                    if (nums[startIndex] <= threshold && nums[startIndex] % 2 != flag) {
                        currentResult += 1
                        flag = nums[startIndex] % 2
                        result = Math.max(result, currentResult)
                        startIndex += 1
                    } else if (nums[startIndex] % 2 == 0) {
                        flag = 1
                        currentResult = 0
                    } else {
                        startIndex += 1
                        break
                    }
                }
            }
            return result
        }
    }
}