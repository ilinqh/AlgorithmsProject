package medium

class _29DivideTwoIntegers {
    class Solution {
        fun divide(a: Int, b: Int): Int {
            var dividend = Math.abs(a.toLong())
            val divisor = Math.abs(b.toLong())
            var quotient = 0L
            for (i in 31 downTo 0) {
                if ((dividend shr i) >= divisor) {
                    quotient += 1L shl i
                    dividend -= divisor shl i
                }
            }
            if ((a xor b) < 0) {
                quotient = quotient.inv() + 1
            }
            if (quotient == (1L shl 31)) {
                return (quotient - 1).toInt()
            }
            return quotient.toInt()
        }
    }
}