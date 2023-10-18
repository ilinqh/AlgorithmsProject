package medium

import java.util.*

class _2530MaximalScoreAfterApplyingKOperations {
    class Solution {
        fun maxKelements(nums: IntArray, k: Int): Long {
            val q = PriorityQueue<Int> { a, b ->
                b - a
            }
            for (num in nums) {
                q.offer(num)
            }
            var result = 0L
            for (i in 0 until k) {
                val x = q.poll()
                result += x
                q.offer((x + 2) / 3)
            }
            return result
        }
    }
}