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
}