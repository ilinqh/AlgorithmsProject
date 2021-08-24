package easy

class _136SingleNumber {
    /**
     * 异或运算
     * 假定 x 可以表示任何数字，则有 0 ^ x = x
     * 同时，x ^ x = 0
     */

class Solution {
    fun singleNumber(nums: IntArray): Int {
        var single = 0
        for (i in nums.indices) {
            single = single xor nums[i]
        }
        return single
    }
}
}