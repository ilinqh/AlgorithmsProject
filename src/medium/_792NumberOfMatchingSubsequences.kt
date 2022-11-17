package medium

class _792NumberOfMatchingSubsequences {
    class Solution {
        fun numMatchingSubseq(s: String, words: Array<String>): Int {
            var ans = words.size
            val array = Array(26) { ArrayList<Int>() }
            for (i in s.indices) {
                array[s[i] - 'a'].add(i)
            }
            for (word in words) {
                if (word.length > s.length) {
                    ans -= 1
                    continue
                }
                var position = -1
                for (ch in word) {
                    if (array[ch - 'a'].isEmpty() || array[ch - 'a'][array[ch - 'a'].size - 1] <= position) {
                        ans -= 1
                        break
                    }
                    position = bs(array[ch - 'a'], position)
                }
            }
            return ans
        }

        private fun bs(list: List<Int>, target: Int): Int {
            var left = 0
            var right = list.size - 1
            while (left < right) {
                val middle = ((right - left) shr 1) + left
                if (list[middle] > target) {
                    right = middle
                } else {
                    left = middle + 1
                }
            }
            return list[left]
        }
    }
}