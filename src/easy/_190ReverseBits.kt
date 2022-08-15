package easy

class _190ReverseBits {
    class Solution {
        fun reverseBits(n: Int): Int {
            var rev = 0
            var tempN = n
            var i = 0
            while (i < 32 && tempN != 0) {
                rev = rev or (tempN and 1 shl (31 - i))
                tempN = tempN ushr 1
                i += 1
            }
            return rev
        }
    }
}