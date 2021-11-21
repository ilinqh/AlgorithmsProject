package medium

class _394DecodeString {
    class Solution {
        private lateinit var src: String
        private var ptr = 0
        fun decodeString(s: String): String {
            src = s
            return getString()
        }

        private fun getString(): String {
            if (ptr == src.length || src[ptr] == ']') {
                return ""
            }
            var repTime = 1
            val sb = StringBuilder()
            if (src[ptr].isDigit()) {
                repTime = getDigits()
                ptr += 1
                val str = getString()
                ptr += 1
                while (repTime > 0) {
                    repTime -= 1
                    sb.append(str)
                }
            } else {
                sb.append(src[ptr])
                ptr += 1
            }
            return sb.append(getString()).toString()
        }

        private fun getDigits(): Int {
            var ret = 0
            while (ptr < src.length && src[ptr].isDigit()) {
                ret = ret * 10 + (src[ptr] - '0')
                ptr += 1
            }
            return ret
        }
    }
}