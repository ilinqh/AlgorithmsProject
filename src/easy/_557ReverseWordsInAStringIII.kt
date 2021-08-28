package easy

class _557ReverseWordsInAStringIII {
    class Solution {
        fun reverseWords(s: String): String {
            val sb = StringBuffer()
            val length = s.length
            var i = 0
            while (i < length) {
                var start = i
                while (i < length && s[i] != ' ') {
                    i++
                }
                for (p in start until i) {
                    sb.append(s[start + i - p - 1])
                }
                while (i < length && s[i] == ' ') {
                    i++
                    sb.append(' ')
                }
            }
            return sb.toString()
        }
    }
}