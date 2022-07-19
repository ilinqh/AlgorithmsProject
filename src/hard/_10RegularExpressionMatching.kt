package hard

class _10RegularExpressionMatching {
    class Solution {
        fun isMatch(s: String, p: String): Boolean {
            val m = s.length
            val n = p.length
            val f = Array(m + 1) {
                BooleanArray(n + 1)
            }
            f[0][0] = true
            for (i in 0..m) {
                for (j in 1..n) {
                    if (p[j - 1] == '*') {
                        f[i][j] = f[i][j - 2]
                        if (matches(s, p, i, j - 1)) {
                            f[i][j] = f[i][j] || f[i - 1][j]
                        }
                    } else {
                        if (matches(s, p, i, j)) {
                            f[i][j] = f[i - 1][j - 1]
                        }
                    }
                }
            }
            return f[m][n]
        }

        private fun matches(s: String, p: String, i: Int, j: Int): Boolean {
            if (i == 0) {
                return false
            }
            if (p[j - 1] == '.') {
                return true
            }
            return s[i - 1] == p[j - 1]
        }
    }
}