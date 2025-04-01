package medium

class _2140SolvingQuestionsWithBrainpower {
    /**
     * 由后往前推， dp[i] 表示由后往前答题 i 位置最高得分
     */
    class Solution {
        fun mostPoints(questions: Array<IntArray>): Long {
            val length = questions.size
            val dp = Array(length + 1) { 0L }

            for (i in length - 1 downTo 0) {
                dp[i] = Math.max(dp[i + 1], questions[i][0] + dp[Math.min(length, i + questions[i][1] + 1)])
            }
            return dp[0]
        }
    }
}