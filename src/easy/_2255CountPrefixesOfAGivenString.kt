package easy

class _2255CountPrefixesOfAGivenString {
    class Solution {
        fun countPrefixes(words: Array<String>, s: String): Int {
            var result = 0
            var addOne = true
            for (word in words) {
                if (word.length > s.length) {
                    continue
                }
                for (i in word.indices) {
                    if (word[i] != s[i]) {
                        addOne = false
                        break
                    }
                }
                if (addOne) {
                    result += 1
                }
                addOne = true
            }
            return result
        }
    }
}