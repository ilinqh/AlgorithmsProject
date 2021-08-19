package medium

import kotlin.math.abs

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

    // Other

    class OtherSolution {
        fun divide(dividend: Int, divisor: Int): Int {
            if (dividend == Integer.MIN_VALUE && divisor == -1) {
                return Integer.MAX_VALUE
            }

            if (divisor == -1)
                return -dividend
            if (divisor == 1)
                return dividend

            var sign = -1

            if (dividend > 0 && divisor > 0)
                sign = 1
            if (dividend < 0 && divisor < 0)
                sign = 1

            val result = div(0L, abs(dividend.toLong()), abs(dividend.toLong()), abs(divisor.toLong()))
            if (result > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE * sign
            }
            return result.toInt() * sign

        }

        fun div(left: Long, right: Long, dividend: Long, divisor: Long): Long {
            val e = left + ((right - left) shr 1)


            if ((e + 1) * divisor == dividend) {
                return e + 1
            }

            if (e * divisor == dividend) {
                return e
            }

            if (e * divisor < dividend) {
                if ((e + 1) * divisor > dividend)
                    return e
            }

            if ((e + 1) * divisor < dividend) {
                return div(e + 1, right, dividend, divisor)
            }

            if (e * divisor > dividend) {
                return div(left, e - 1, dividend, divisor)
            }
            return 0
        }
    }

}