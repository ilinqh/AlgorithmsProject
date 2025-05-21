package medium

class _3356ZeroArrayTransformationIi {
    class Solution {
        fun minZeroArray(nums: IntArray, queries: Array<IntArray>): Int {
            var left = 0
            var right = queries.size
            if (!check(nums, queries, right)) {
                return -1
            }
            while (left < right) {
                val k = left + ((right - left) shr 1)
                if (check(nums, queries, k)) {
                    right = k
                } else {
                    left = k + 1
                }
            }
            return left
        }

        private fun check(nums: IntArray, queries: Array<IntArray>, k: Int): Boolean {
            val deltaArray = IntArray(nums.size + 1)
            for (i in 0 until k) {
                deltaArray[queries[i][0]] += queries[i][2]
                deltaArray[queries[i][1] + 1] -= queries[i][2]
            }
            val operationCounts = IntArray(deltaArray.size)
            var currentOperations = 0
            for (i in operationCounts.indices) {
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