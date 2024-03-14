package medium

class _2789LargestElementInAnArrayAfterMergeOperations {
    class Solution {
        fun maxArrayValue(nums: IntArray): Long {
            val size = nums.size
            val longNums = LongArray(size)
            nums.forEachIndexed { index, i ->
                longNums[index] = i.toLong()
            }
            var result = longNums.last()
            var index = size - 2
            while (index >= 0) {
                if (longNums[index] <= longNums[index + 1]) {
                    longNums[index] += longNums[index + 1]
                }
                result = Math.max(result, longNums[index])
                index -= 1
            }
            return result
        }
    }
}