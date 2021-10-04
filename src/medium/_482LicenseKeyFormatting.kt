package medium

class _482LicenseKeyFormatting {
    class Solution {
        fun licenseKeyFormatting(s: String, k: Int): String {
            val length = s.length
            val sb = StringBuilder()
            var cnt = 0
            for (i in (s.length - 1) downTo 0) {
                if (s[i] != '-') {
                    cnt += 1
                    sb.append(s[i].toUpperCase())
                    if (cnt % k == 0) {
                        sb.append('-')
                    }
                }
            }
            if (sb.isNotEmpty() && sb[sb.length - 1] == '-') {
                sb.deleteCharAt(sb.length - 1)
            }
            return sb.reverse().toString()
        }
    }
}