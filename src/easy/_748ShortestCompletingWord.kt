package easy

class _748ShortestCompletingWord {
    class Solution {
        fun shortestCompletingWord(licensePlate: String, words: Array<String>): String {
            var idx = -1
            val cnt = IntArray(26)
            for (i in licensePlate.indices) {
                val ch = licensePlate[i]
                if (Character.isLetter(ch)) {
                    cnt[ch.lowercaseChar() - 'a'] += 1
                }
            }
            for (i in words.indices) {
                val c = IntArray(26)
                val word = words[i]
                for (j in word.indices) {
                    c[word[j] - 'a'] += 1
                }
                var ok = true
                for (j in 0 until 26) {
                    if (c[j] < cnt[j]) {
                        ok = false
                        break
                    }
                }
                if (ok && (idx < 0 || words[i].length < words[idx].length)) {
                    idx = i
                }
            }
            return words[idx]
        }
    }
}