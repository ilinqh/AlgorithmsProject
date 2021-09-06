package medium

class _57InsertInterval {
    class Solution {
        fun insert(intervals: Array<IntArray>, newInterval: IntArray): Array<IntArray> {
            var left = newInterval[0]
            var right = newInterval[1]
            val ansList = ArrayList<IntArray>()
            var placed = false
            for (interval in intervals) {
                if (interval[0] > right) {
                    if (!placed) {
                        placed = true
                        ansList.add(intArrayOf(left, right))
                    }
                    ansList.add(interval)
                } else if (interval[1] < left) {
                    ansList.add(interval)
                } else {
                    left = Math.min(left, interval[0])
                    right = Math.max(right, interval[1])
                }
            }
            if (!placed) {
                ansList.add(intArrayOf(left, right))
            }
            val ans = Array(ansList.size) { IntArray(2) }
            for (i in ansList.indices) {
                ans[i] = ansList[i]
            }
            return ans
        }
    }
}