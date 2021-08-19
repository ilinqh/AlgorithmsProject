package medium

class _38CountAndSay {
    class Solution {
        fun countAndSay(n: Int): String {
            var s = "1"
            val sb = StringBuffer()
            for (i in 1 until n) {
                sb.delete(0, sb.length)
                var j = 0
                while (j < s.length) {
                    var count = 1
                    var index = j
                    while (index + 1 < s.length && s[index] == s[index + 1]) {
                        count++
                        index++
                    }
                    sb.append(count).append(s[j])
                    j += count
                }

                s = sb.toString()
            }
            return s
        }
    }
}