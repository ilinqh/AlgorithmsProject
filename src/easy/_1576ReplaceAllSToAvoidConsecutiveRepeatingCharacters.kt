package easy

class _1576ReplaceAllSToAvoidConsecutiveRepeatingCharacters {
    class Solution {
        fun modifyString(s: String): String {
            val n = s.length
            val sb = StringBuilder()
            for (i in 0 until n) {
                if (s[i] == '?') {
                    for (ch in 'a'..'c') {
                        if ((i > 0 && sb[i - 1] == ch) || (i < n - 1 && s[i + 1] == ch)) {
                            continue
                        }
                        sb.append(ch)
                        break
                    }
                } else {
                    sb.append(s[i])
                }
            }
            return sb.toString()
        }
    }
}