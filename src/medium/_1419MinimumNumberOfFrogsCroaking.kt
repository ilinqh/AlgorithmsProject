package medium

class _1419MinimumNumberOfFrogsCroaking {
    class Solution {
        fun minNumberOfFrogs(croakOfFrogs: String): Int {
            val length = croakOfFrogs.length
            if (length % 5 != 0) {
                return -1
            }
            var result = 0
            var frogNum = 0
            val map = mapOf('c' to 0, 'r' to 1, 'o' to 2, 'a' to 3, 'k' to 4)
            val cnt = arrayOf(0, 0, 0, 0)
            for (ch in croakOfFrogs) {
                val t = map[ch] ?: 0
                if (t == 0) {
                    cnt[t] += 1
                    frogNum += 1
                    if (frogNum > result) {
                        result = frogNum
                    }
                } else {
                    if (cnt[t - 1] == 0) {
                        return -1
                    }
                    cnt[t - 1] -= 1
                    if (t == 4) {
                        frogNum -= 1
                    } else {
                        cnt[t] += 1
                    }
                }
            }
            if (frogNum > 0) {
                return -1
            }
            return result
        }
    }
}