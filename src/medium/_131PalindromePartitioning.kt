package medium

class _131PalindromePartitioning {
    class Solution {
        fun partition(s: String): List<List<String>> {
            val length = s.length
            val cs = s.toCharArray()
            val dp = Array(length) { BooleanArray(length) }
            for (j in 0 until length) {
                for (i in j downTo 0) {
                    if (i == j) {
                        dp[i][j] = true
                    } else {
                        if (j - i + 1 == 2) {
                            dp[i][j] = cs[i] == cs[j]
                        } else {
                            dp[i][j] = cs[i] == cs[j] && dp[i + 1][j - 1]
                        }
                    }
                }
            }
            val result = ArrayList<List<String>>()
            val cur = ArrayList<String>()
            dfs(s, 0, result, cur, dp)
            return result
        }

        private fun dfs(
            s: String,
            index: Int,
            ans: ArrayList<List<String>>,
            cur: ArrayList<String>,
            dp: Array<BooleanArray>
        ) {
            val length = s.length
            if (index == length) {
                ans.add(ArrayList(cur))
            }
            for (i in index until length) {
                if (dp[index][i]) {
                    cur.add(s.substring(index, i + 1))
                    dfs(s, i + 1, ans, cur, dp)
                    cur.removeAt(cur.size - 1)
                }
            }
        }
    }
}