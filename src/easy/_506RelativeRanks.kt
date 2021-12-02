package easy

import java.util.*


class _506RelativeRanks {
class Solution {
    fun findRelativeRanks(score: IntArray): Array<String> {
        val n = score.size
        val desc = arrayOf("Gold Medal", "Silver Medal", "Bronze Medal")
        val arr = Array(n) { IntArray(2) }
        for (i in score.indices) {
            arr[i][0] = score[i]
            arr[i][1] = i
        }
        Arrays.sort(arr) { a: IntArray, b: IntArray ->
            b[0] - a[0]
        }
        val ans = Array(n) { "" }
        for (i in 0 until n) {
            if (i >= 3) {
                ans[arr[i][1]] = (i + 1).toString()
            } else {
                ans[arr[i][1]] = desc[i]
            }
        }
        return ans
    }
}
}