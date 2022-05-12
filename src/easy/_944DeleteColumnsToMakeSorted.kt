package easy

class _944DeleteColumnsToMakeSorted {
    class Solution {
        fun minDeletionSize(strs: Array<String>): Int {
            val row = strs.size
            val column = strs[0].length
            var ans = 0
            for (i in 0 until column) {
                var last = strs[0][i]
                for (j in 1 until row) {
                    if (strs[j][i] - last < 0) {
                        ans += 1
                        break
                    } else {
                        last = strs[j][i]
                    }
                }
            }
            return ans
        }
    }
}