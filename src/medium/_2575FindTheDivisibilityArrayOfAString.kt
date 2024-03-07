package medium

class _2575FindTheDivisibilityArrayOfAString {
    class Solution {
        fun divisibilityArray(word: String, m: Int): IntArray {
            val length = word.length
            var count = 0L
            val div = IntArray(length) { 0 }
            for (i in 0 until length) {
                val current = word[i] - '0'
                count = (count * 10 + current) % m
                if (count == 0L) {
                    div[i] = 1
                }
            }
            return div
        }
    }
}