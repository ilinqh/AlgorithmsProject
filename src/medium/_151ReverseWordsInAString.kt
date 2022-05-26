package medium

import java.util.*

class _151ReverseWordsInAString {
    class Solution {
        fun reverseWords(s: String): String {
            // 除去开头和末尾的空白字符
            val tempS = s.trim();
            // 正则匹配连续的空白字符作为分隔符分割
            val wordList = tempS.split(Regex("\\s+"))
            Collections.reverse(wordList)
            return wordList.joinToString(" ")
        }
    }
}