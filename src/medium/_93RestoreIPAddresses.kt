package medium

class _93RestoreIPAddresses {
    class Solution {
        private val result = ArrayList<String>()
        private val segments = IntArray(4)
        fun restoreIpAddresses(s: String): List<String> {
            backtrace(s, 0, 0)
            return result
        }

        private fun backtrace(
            s: String,
            segmentId: Int,
            segmentStart: Int
        ) {
            if (segmentId == 4) {
                if (segmentStart == s.length) {
                    val sb = StringBuffer()
                    for (i in 0 until 4) {
                        sb.append(segments[i])
                        if (i != 3) sb.append('.')
                    }
                    result.add(sb.toString())
                }
                return
            }
            if (segmentStart == s.length) {
                return
            }
            if (s[segmentStart] == '0') {
                segments[segmentId] = 0
                backtrace(s, segmentId + 1, segmentStart + 1)
            }

            var addr = 0
            for (i in segmentStart until s.length) {
                addr = addr * 10 + (s[i] - '0')
                if (addr in 1..0xFF) {
                    segments[segmentId] = addr
                    backtrace(s, segmentId + 1, i + 1)
                } else {
                    break
                }
            }
        }
    }
}