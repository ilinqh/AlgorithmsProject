package hard

class _446ArithmeticSlicesII {
    class Solution {
        fun numberOfArithmeticSlices(nums: IntArray): Int {
            if (nums.size < 3) {
                return 0
            }
            var ans = 0
            val length = nums.size
            val f = arrayOfNulls<HashMap<Long, Int>>(length)
            for (i in nums.indices) {
                f[i] = HashMap()
            }
            for (i in nums.indices) {
                for (j in 0 until i) {
                    val d = 1L * nums[i] - nums[j]
                    val cnt = f[j]!!.getOrDefault(d, 0)
                    ans += cnt
                    f[i]!![d] = f[i]!!.getOrDefault(d, 0) + cnt + 1
                }
            }
            return ans
        }
    }
}