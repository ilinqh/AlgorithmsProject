package easy

class _434NumberOfSegmentsInAString {
    class Solution {
        fun countSegments(s: String): Int {
            val length = s.length
            var count = 0
            for (i in s.indices) {
                if ((i == 0 || s[i - 1] == ' ') && s[i] != ' ') {
                    count += 1
                }
            }
            return count
        }
    }
}