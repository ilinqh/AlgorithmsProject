package medium

import java.util.*

class _539MinimumTimeDifference {
    class Solution {
        fun findMinDifference(timePoints: List<String>): Int {
            val length = timePoints.size
            if (length > 1440) {
                return 0
            }
            Collections.sort(timePoints)
            var ans = Int.MAX_VALUE
            val t0 = getMinute(timePoints[0])
            var pre = t0
            for (i in 1 until length) {
                val minute = getMinute(timePoints[i])
                ans = Math.min(ans, minute - pre)
                pre = minute
            }
            ans = Math.min(ans, t0 + 1440 - pre)
            return ans
        }

        private fun getMinute(timePoint: String): Int {
            return ((timePoint[0] - '0') * 10 + (timePoint[1] - '0')) * 60 + (timePoint[3] - '0') * 10 + (timePoint[4] - '0')
        }
    }
}