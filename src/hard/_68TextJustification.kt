package hard

class _68TextJustification {
    class Solution {
        fun fullJustify(words: Array<String>, maxWidth: Int): List<String> {
            val ans = ArrayList<String>()
            var right = 0
            var n = words.size
            while (true) {
                val left = right
                var sumLen = 0
                // 确定当前行可以放多少个单词，同时每个单词之间至少有一个空格
                while (right < n && sumLen + words[right].length + right - left <= maxWidth) {
                    sumLen += words[right].length
                    right += 1
                }
                if (right == n) {
                    val sb = join(words, left, n, " ")
                    sb.append(blank(maxWidth - sb.length))
                    ans.add(sb.toString())
                    return ans
                }

                val numWords = right - left
                val numSpaces = maxWidth - sumLen

                if (numWords == 1) {
                    val sb = StringBuffer(words[left])
                    sb.append(blank(numSpaces))
                    ans.add(sb.toString())
                    continue
                }

                val avgSpaces = numSpaces / (numWords - 1)
                val extraSpaces = numSpaces % (numWords - 1)
                val sb = StringBuffer()
                sb.append(join(words, left, left + extraSpaces + 1, blank(avgSpaces + 1)))
                sb.append(blank(avgSpaces))
                sb.append(join(words, left + extraSpaces + 1, right, blank(avgSpaces)))
                ans.add(sb.toString())
            }
        }

        private fun blank(n: Int): String {
            val sb = StringBuffer()
            for (i in 0 until n) {
                sb.append(' ')
            }
            return sb.toString()
        }

        private fun join(words: Array<String>, left: Int, right: Int, step: String): StringBuffer {
            val sb = StringBuffer(words[left])
            for (i in left + 1 until right) {
                sb.append(step).append(words[i])
            }
            return sb
        }
    }
}