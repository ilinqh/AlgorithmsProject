package easy

class _1957DeleteCharactersToMakeFancyString {
    class Solution {
        fun makeFancyString(s: String): String {
            val sb = StringBuilder()
            for (i in s.indices) {
                val ch = s[i]
                val length = sb.length
                if (length > 1 && sb[length - 1] == ch && sb[length - 2] == ch) {
                    continue
                }
                sb.append(ch)
            }
            return sb.toString()
        }
    }
}