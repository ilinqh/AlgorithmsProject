package easy

class _67AddBinary {
    class Solution {
        fun addBinary(a: String, b: String): String {
            val tempA: String
            val tempB: String
            if (a.length >= b.length) {
                tempA = a.reversed()
                tempB = b.reversed()
            } else {
                tempA = b.reversed()
                tempB = a.reversed()
            }
            var addition = 0
            val sb = StringBuffer()
            for (i in tempA.indices) {
                val x = tempA[i] - '0'
                val y = if (i < tempB.length) {
                    tempB[i] - '0'
                } else {
                    0
                }
                val sum = x + y + addition
                sb.append((sum % 2).digitToChar())
                addition = sum / 2
            }
            if (addition == 1) {
                sb.append('1')
            }
            return sb.toString().reversed()
        }
    }

    // Best

    class BestSolution {
        fun addBinary(a: String, b: String): String {
            val result: StringBuilder = StringBuilder()
            var needCarry = false
            val count = Math.max(a.length, b.length)
            for (i in 0 until count) {
                val aTmp = a.getReversedCharByIndex(i)
                val bTmp = b.getReversedCharByIndex(i)
                if(aTmp != bTmp) {
                    result.append(if (needCarry) "0" else "1")
                } else {
                    result.append(if (needCarry) "1" else "0")
                    needCarry = aTmp == '1'
                }
            }
            if (needCarry) result.append("1")
            return result.reversed().toString()
        }

        fun String.getReversedCharByIndex(index: Int) = if (index < length) this[length - index - 1] else '0'
    }
}