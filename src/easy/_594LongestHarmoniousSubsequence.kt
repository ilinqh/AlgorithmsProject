package easy

class _594LongestHarmoniousSubsequence {
    class Solution {
        fun findLHS(nums: IntArray): Int {
            var ans = 0
            val map = HashMap<Int, Int>()
            for (i in nums.indices) {
                map[nums[i]] = map.getOrDefault(nums[i], 0) + 1
            }
            for (key in map.keys) {
                if (map.containsKey(key + 1)) {
                    ans = Math.max(map[key]!! + map[key + 1]!!, ans)
                }
            }
            return ans
        }
    }
}