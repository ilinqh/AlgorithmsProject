package medium

class _2680MaximumOr {

    /**
     * 解题思路：
     * 维护一个前缀或值，该值与当前枚举值进行与运算即可得到出现两次及以上的 1，将所有这些 1 进行或运算得到 multiBits。
     * 所有数字的或值为 orSum，当前枚举的数字为 num，那么 orSum 异或 x 后再与 multiBits 进行或运算即可得到除去 x 后剩余所有整数的或值。
     */
    class Solution {
        fun maximumOr(nums: IntArray, k: Int): Long {
            var orSum = 0
            var multiDit = 0
            for (num in nums) {
                multiDit = multiDit or (num and orSum)
                orSum = orSum or num
            }
            var result = 0L
            for (num in nums) {
                result = Math.max(result, (orSum xor num).toLong() or ((num.toLong() shl k) or multiDit.toLong()))
            }
            return result
        }
    }
}