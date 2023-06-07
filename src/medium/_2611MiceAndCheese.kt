package medium

import java.util.*

class _2611MiceAndCheese {
    class Solution {
        fun miceAndCheese(reward1: IntArray, reward2: IntArray, k: Int): Int {
            var result = 0
            val length = reward1.size
            val diff = IntArray(length)
            for (index in reward2.indices) {
                result += reward2[index]
                diff[index] = reward1[index] - reward2[index]
            }
            Arrays.sort(diff)
            for (i in 1..k) {
                result += diff[length - i]
            }
            return result
        }
    }
}