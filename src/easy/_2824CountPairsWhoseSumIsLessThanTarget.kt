package easy

import java.util.*

class _2824CountPairsWhoseSumIsLessThanTarget {
    class Solution {
        fun countPairs(nums: List<Int>, target: Int): Int {
            Collections.sort(nums) { a, b ->
                a - b
            }
            var head = 0
            var next = 0
            var result = 0

            while (head < nums.size - 1) {
                if (nums[head] > 0 && nums[head] >= target) {
                    break
                }
                next = head + 1
                while (next < nums.size && nums[head] + nums[next] < target) {
                    result += 1
                    next += 1
                }
                head += 1
            }
            return result
        }
    }
}