package medium

import java.util.*

class _2007FindOriginalArrayFromDoubledArray {
    class Solution {
        fun findOriginalArray(changed: IntArray): IntArray {
            Arrays.sort(changed)
            val map = HashMap<Int, Int>()
            for (item in changed) {
                map[item] = map.getOrDefault(item, 0) + 1
            }
            val res = IntArray(changed.size / 2)
            var index = 0
            for (item in changed) {
                if (map[item] == 0) {
                    continue
                }
                map[item] = map[item]!! - 1
                if (map.getOrDefault(item * 2, 0) == 0) {
                    return intArrayOf()
                }
                map[item * 2] = map[item * 2]!! - 1
                res[index] = item
                index += 1
            }
            return res
        }
    }
}