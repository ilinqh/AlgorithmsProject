package medium

class _869ReorderedPowerOf2 {
    class Solution {
        private val set = HashSet<String>()
        fun reorderedPowerOf2(n: Int): Boolean {
            initSet()
            return set.contains(countDigits(n))
        }

        private fun initSet() {
            var i = 1
            while (i <= 1e9) {
                set.add(countDigits(i))
                i = i shl 1
            }
        }

        private fun countDigits(n: Int): String {
            val char = CharArray(10)
            var num = n
            while (num > 0) {
                ++char[num % 10]
                num /= 10
            }
            return String(char)
        }
    }
}