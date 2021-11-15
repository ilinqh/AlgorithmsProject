package medium

import java.util.*

class _739DailyTemperatures {
    class Solution {
        fun dailyTemperatures(temperatures: IntArray): IntArray {
            val length = temperatures.size
            val ans = IntArray(length)
            val stack = LinkedList<Int>()
            for (i in 0 until length) {
                while (stack.isNotEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                    val preV = stack.pop()
                    ans[preV] = i - preV
                }
                stack.push(i)
            }
            return ans
        }
    }
}