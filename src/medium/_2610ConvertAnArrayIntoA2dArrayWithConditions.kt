package medium

class _2610ConvertAnArrayIntoA2dArrayWithConditions {
    class Solution {
        fun findMatrix(nums: IntArray): List<List<Int>> {
            val map = HashMap<Int, Int>()
            for (i in nums) {
                map[i] = map.getOrDefault(i, 0) + 1
            }
            var maxSize = 0
            for (keyEntry in map) {
                maxSize = Math.max(maxSize, keyEntry.value)
            }
            val result = ArrayList<List<Int>>()
            for (i in 0 until maxSize) {
                val list = ArrayList<Int>()
                for ((key, value) in map) {
                    if (value > 0) {
                        list.add(key)
                        map[key] = value - 1
                    }
                }
                result.add(list)
            }
            return result
        }
    }
}