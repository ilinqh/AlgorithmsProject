package medium

import java.util.*

class _954ArrayOfDoubledPairs {
    class Solution {
        fun canReorderDoubled(arr: IntArray): Boolean {
            val cnt = HashMap<Int, Int>()
            for (i in arr.indices) {
                cnt[arr[i]] = cnt.getOrDefault(arr[i], 0) + 1
            }
            if (cnt.getOrDefault(0, 0) % 2 != 0) {
                return false
            }
            val list = ArrayList<Int>()
            for (i in cnt.keys.indices) {
                list.add(cnt.keys.elementAt(i))
            }
            Collections.sort(list, { a, b ->
                Math.abs(a) - Math.abs(b)
            })
            for (i in list.indices) {
                val x = list[i]
                if (cnt.getOrDefault(2 * x, 0) < cnt[x]!!) {
                    return false
                }
                cnt[2 * x] = cnt.getOrDefault(2 * x, 0) - cnt[x]!!
            }
            return true
        }
    }
}