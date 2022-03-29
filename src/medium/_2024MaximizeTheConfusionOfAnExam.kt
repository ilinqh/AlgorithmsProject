package medium

class _2024MaximizeTheConfusionOfAnExam {
    class Solution {
        fun maxConsecutiveAnswers(answerKey: String, k: Int): Int {
            return Math.max(maxConsecutiveChar(answerKey, k, 'T'), maxConsecutiveChar(answerKey, k, 'F'))
        }

        private fun maxConsecutiveChar(answerKey: String, k: Int, char: Char): Int {
            var ans = 0
            val n = answerKey.length
            var left = 0
            var right = 0
            var sum = 0
            while (right < n) {
                sum += if (answerKey[right] != char) {
                    1
                } else {
                    0
                }
                while (sum > k) {
                    sum -= if (answerKey[left++] != char) {
                        1
                    } else {
                        0
                    }
                }
                ans = Math.max(ans, right - left + 1)
                right += 1
            }
            return ans
        }
    }
}