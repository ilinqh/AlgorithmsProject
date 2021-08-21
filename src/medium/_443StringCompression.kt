package medium

class _443StringCompression {
    class Solution {
        fun compress(chars: CharArray): Int {
            val length = chars.size
            if (length == 1) {
                return length
            }
            var write = 0
            var left = 0
            for (read in 0 until length) {
                if (read == length - 1 || chars[read] != chars[read + 1]) {
                    chars[write++] = chars[read]
                    var count = read - left + 1
                    if (count > 1) {
                        val anchor = write
                        while (count > 0) {
                            chars[write++] = '0' + (count % 10)
                            count /= 10
                            reverse(chars, anchor, write - 1)
                        }
                    }
                    left = read + 1
                }
            }
            return write
        }

        private fun reverse(chars: CharArray, tempLeft: Int, tempRight: Int) {
            var left = tempLeft
            var right = tempRight
            while (left < right) {
                val temp = chars[left]
                chars[left] = chars[right]
                chars[right] = temp
                left++
                right--
            }
        }
    }
}