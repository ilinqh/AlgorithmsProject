package medium

class _1218LongestArithmeticSubsequenceOfGivenDifference {
    class Solution {
        fun longestSubsequence(arr: IntArray, difference: Int): Int {
            var ans = 0
            val dp = HashMap<Int, Int>()
            for (v in arr) {
                dp[v] = dp.getOrDefault(v - difference, 0) + 1
                ans = Math.max(ans, dp[v]!!)
            }
            return ans
        }
    }
}