package medium

class _1726TupleWithSameProduct {
    class Solution {
        fun tupleSameProduct(nums: IntArray): Int {
            val length = nums.size
            val map = HashMap<Int, Int>()
            for (i in 0 until length - 1) {
                for (j in i + 1 until length) {
                    val count = nums[i] * nums[j]
                    map[count] = map.getOrDefault(count, 0) + 1
                }
            }
            var result = 0
            for (value in map.values) {
                if (value > 1) {
                    result += value * (value - 1) / 2
                }
            }
            return result * 8
        }
    }
}