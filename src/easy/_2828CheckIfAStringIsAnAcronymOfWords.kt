package easy

class _2828CheckIfAStringIsAnAcronymOfWords {
    class Solution {
        fun isAcronym(words: List<String>, s: String): Boolean {
            val listLength = words.size
            val sLength = s.length
            if (listLength != sLength) {
                return false
            }
            for (i in s.indices) {
                if (words[i].first() != s[i]) {
                    return false
                }
            }
            return true
        }
    }
}