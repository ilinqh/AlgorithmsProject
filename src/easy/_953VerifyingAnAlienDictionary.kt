package easy

class _953VerifyingAnAlienDictionary {
    class Solution {
        fun isAlienSorted(words: Array<String>, order: String): Boolean {
            val index = IntArray(26)
            for (i in order.indices) {
                index[order[i] - 'a'] = i
            }
            for (i in 1 until words.size) {
                var j = 0
                var valid = false
                while (j < words[i - 1].length && j < words[i].length) {
                    val prev = index[words[i - 1][j] - 'a']
                    val cur = index[words[i][j] - 'a']
                    if (prev < cur) {
                        valid = true
                        break
                    } else if (prev > cur) {
                        return false
                    }
                    j += 1
                }
                if (!valid && words[i - 1].length > words[i].length) {
                    return false
                }
            }
            return true
        }
    }
}