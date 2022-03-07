package medium

class _2100FindGoodDaysToRobTheBank {
    class Solution {
        fun goodDaysToRobBank(security: IntArray, time: Int): List<Int> {
            val length = security.size
            val left = IntArray(length) { 0 }
            val right = IntArray(length) { 0 }
            for (i in 1 until security.size) {
                if (security[i] <= security[i - 1]) {
                    left[i] = left[i - 1] + 1
                }
                if (security[length - i - 1] <= security[length - i]) {
                    right[length - i - 1] = right[length - i] + 1
                }
            }
            val ans = ArrayList<Int>()
            for (i in time until length - time) {
                if (left[i] >= time && right[i] >= time) {
                    ans.add(i)
                }
            }
            return ans
        }
    }
}