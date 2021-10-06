package easy

class _414ThirdMaximumNumber {
    class Solution {
        fun thirdMax(nums: IntArray): Int {
            var a: Int? = null
            var b: Int? = null
            var c: Int? = null
            for (num in nums) {
                if (a == null || num > a) {
                    c = b
                    b = a
                    a = num
                } else if (a > num && (b == null || num > b)) {
                    c = b
                    b = num
                } else if (b != null && b > num && (c == null || num > c)) {
                    c = num
                }
            }
            return c ?: a!!
        }
    }
}