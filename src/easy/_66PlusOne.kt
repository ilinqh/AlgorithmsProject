package easy

class _66PlusOne {
    class Solution {
        fun plusOne(digits: IntArray): IntArray {
            for (i in (digits.size - 1) downTo 0) {
                if (digits[i] == 9) {
                    digits[i] = 0
                } else {
                    digits[i] += 1
                    return digits
                }
            }
            val tempDigits = IntArray(digits.size + 1)
            tempDigits[0] = 1
            return tempDigits
        }
    }

    // Best

    class BestSolution {
        fun plusOne(digits: IntArray): IntArray {

            for (i in digits.size - 1 downTo 0) {
                digits[i]++
                //查看是否有进位
                digits[i] = digits[i] % 10
                if (digits[i] != 0) {
                    //说明没有进位 返回原数组
                    return digits
                }
            }

            //原数组一直有进位 扩充原数组
            val digits1 = IntArray(digits.size + 1)
            digits1[0] = 1
            return digits1
        }
    }

}