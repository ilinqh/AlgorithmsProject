package easy

class _495TeemoAttacking {
    class Solution {
        fun findPoisonedDuration(timeSeries: IntArray, duration: Int): Int {
            var ans = duration
            for (i in (timeSeries.size - 1) downTo 1) {
                ans += if (timeSeries[i] - timeSeries[i - 1] > duration) {
                    duration
                } else {
                    timeSeries[i] - timeSeries[i - 1]
                }
            }
            return ans
        }
    }
}