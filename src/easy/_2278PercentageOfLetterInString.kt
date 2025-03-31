package easy

class _2278PercentageOfLetterInString {
    class Solution {
        fun percentageLetter(s: String, letter: Char): Int {
            var count = 0
            for (ch in s) {
                if (letter == ch) {
                    count += 1
                }
            }
            return count * 100 / s.length
        }
    }
}