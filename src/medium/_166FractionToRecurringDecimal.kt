package medium

class _166FractionToRecurringDecimal {
    class Solution {
        fun fractionToDecimal(numerator: Int, denominator: Int): String {
            var numeratorLong = numerator.toLong()
            var denominatorLong = denominator.toLong()
            if (numeratorLong % denominatorLong == 0L) {
                return (numeratorLong / denominator).toString()
            }
            val sb = StringBuilder()
            if ((numeratorLong < 0L) xor (denominatorLong < 0L)) {
                sb.append('-')
            }
            // 整数部分
            numeratorLong = Math.abs(numeratorLong)
            denominatorLong = Math.abs(denominatorLong)
            val integerPart = numeratorLong / denominatorLong
            sb.append(integerPart).append('.')

            // 小数部分
            val fractionPart = StringBuilder()
            val remainderIndexMap = HashMap<Long, Int>()
            var remainder = numeratorLong % denominatorLong
            var index = 0
            while (remainder != 0L && !remainderIndexMap.containsKey(remainder)) {
                remainderIndexMap[remainder] = index
                remainder *= 10
                fractionPart.append(remainder / denominatorLong)
                remainder %= denominatorLong
                index++
            }
            if (remainder != 0L) {
                val insertIndex = remainderIndexMap[remainder]!!
                fractionPart.insert(insertIndex, '(')
                fractionPart.append(')')
            }
            sb.append(fractionPart)
            return sb.toString()
        }
    }
}