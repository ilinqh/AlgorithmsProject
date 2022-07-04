package easy

import java.util.*

class _1200MinimumAbsoluteDifference {
class Solution {
    fun minimumAbsDifference(arr: IntArray): List<List<Int>> {
        val ans = ArrayList<List<Int>>()
        val length = arr.size
        if (length <= 2) {
            return ans
        }
        Arrays.sort(arr)
        var step = Int.MAX_VALUE
        for (i in 1 until length) {
            if (arr[i] - arr[i - 1] == step) {
                ans.add(listOf(arr[i - 1], arr[i]))
            }
            if (arr[i] - arr[i - 1] < step) {
                ans.clear()
                ans.add(listOf(arr[i - 1], arr[i]))
                step = arr[i] - arr[i - 1]
            }
        }
        return ans
    }
}
}