package easy

import java.util.*

class _453MinimumMovesToEqualArrayElements {
    class Solution {
        fun minMoves(nums: IntArray): Int {
            val minNum = Arrays.stream(nums).min().asInt
            var res = 0
            for (num in nums) {
                res += num - minNum
            }
            return res
        }
    }
}