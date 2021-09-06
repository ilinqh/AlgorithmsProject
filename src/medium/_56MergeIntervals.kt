package medium

import java.util.*

class _56MergeIntervals {
    class Solution {
        fun merge(intervals: Array<IntArray>): Array<IntArray> {
            if (intervals.isEmpty()) {
                return Array(0) { IntArray(0) }
            }
            Arrays.sort(intervals) { o1, o2 ->
                o1[0] - o2[0]
            }
            val merge = ArrayList<IntArray>()
            for (interval in intervals) {
                val left = interval[0]
                val right = interval[1]
                if (merge.isEmpty() || merge.last()[1] < left) {
                    merge.add(interval)
                } else {
                    merge.last()[1] = Math.max(right, merge.last()[1])
                }
            }
            return merge.toArray(Array(merge.size) { IntArray(0) })
        }
    }
}