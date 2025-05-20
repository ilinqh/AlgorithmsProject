package medium

class _3355ZeroArrayTransformationI {
    class Solution {
        fun isZeroArray(nums: IntArray, queries: Array<IntArray>): Boolean {
            val deltaArray = IntArray(nums.size + 1)
            for (query in queries) {
                deltaArray[query[0]] += 1
                deltaArray[query[1] + 1] -= 1
            }
            val operationCounts = IntArray(deltaArray.size)
            var currentOperations = 0
            for (i in deltaArray.indices) {
                currentOperations += deltaArray[i]
                operationCounts[i] = currentOperations
            }
            for (i in nums.indices) {
                if (operationCounts[i] < nums[i]) {
                    return false
                }
            }
            return true
        }
    }
}