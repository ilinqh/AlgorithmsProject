package easy

class _2129CapitalizeTheTitle {
    class Solution {
        fun capitalizeTitle(title: String): String {
            val sb = StringBuilder(title)
            var left = 0
            var right = 0
            val length = title.length
            while (right < length) {
                while (right < length && title[right] != ' ') {
                    right += 1
                }
                if (right - left > 2) {
                    sb.setCharAt(left, title[left].uppercaseChar())
                    left += 1
                }
                while (left < right) {
                    sb.setCharAt(left, title[left].lowercaseChar())
                    left += 1
                }
                left = right + 1
                right += 1
            }
            return sb.toString()
        }
    }
}