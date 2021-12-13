package easy

class _709ToLowerCase {
    class Solution {
        fun toLowerCase(s: String): String {
            val sb = StringBuilder()
            for (i in s.indices) {
                var ch = s[i]
                if (ch.toInt() in 65..90) {
                    ch = (ch.toInt() or 32).toChar()
                }
                sb.append(ch)
            }
            return sb.toString()
        }
    }
}