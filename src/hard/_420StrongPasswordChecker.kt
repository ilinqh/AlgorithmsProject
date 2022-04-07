package hard

class _420StrongPasswordChecker {
    class Solution {
        fun strongPasswordChecker(password: String): Int {
            val n = password.length
            var result = 0
            var hasNum = 0
            var hasLower = 0
            var hasUpper = 0
            for (i in password.indices) {
                val ch = password[i]
                if (ch.isDigit()) {
                    hasNum = 1
                }
                if (ch.isLowerCase()) {
                    hasLower = 1
                }
                if (ch.isUpperCase()) {
                    hasUpper = 1
                }
            }
            val categories = hasNum + hasLower + hasUpper
            if (n < 6) {
                return Math.max(6 - n, 3 - categories)
            } else if (n <= 20) {
                var replace = 0
                var cnt = 0
                var cur = '#'
                for (i in password.indices) {
                    val ch = password[i]
                    if (ch == cur) {
                        cnt += 1
                    } else {
                        replace += cnt / 3
                        cur = ch
                        cnt = 1
                    }
                }
                replace += cnt / 3
                return Math.max(replace, 3 - categories)
            } else {
                var replace = 0
                var remove = n - 20
                var rm2 = 0
                var cnt = 0
                var cur = '#'
                for (i in password.indices) {
                    val ch = password[i]
                    if (ch == cur) {
                        cnt += 1
                    } else {
                        if (remove > 0 && cnt >= 3) {
                            if (cnt % 3 == 0) {
                                remove -= 1
                                replace -= 1
                            } else if (cnt % 3 == 1) {
                                rm2 += 1
                            }
                        }
                        replace += cnt / 3
                        cnt = 1
                        cur = ch
                    }
                }
                if (remove > 0 && cnt >= 3) {
                    if (cnt % 3 == 0) {
                        remove -= 1
                        replace -= 1
                    } else if (cnt % 3 == 1) {
                        rm2 += 1
                    }
                }
                replace += cnt / 3
                val use2 = Math.min(Math.min(replace, rm2), remove / 2)
                replace -= use2
                remove -= use2 * 2
                val use3 = Math.min(replace, remove / 3)
                replace -= use3
                remove -= use3 * 3
                return (n - 20) + Math.max(replace, 3 - categories)
            }
        }
    }
}