package easy

class _693BinaryNumberWithAlternatingBits {
    class Solution {
        fun hasAlternatingBits(n: Int): Boolean {
            val a = n xor (n shr 1)
            return (a and (a + 1)) == 0
        }
    }
}