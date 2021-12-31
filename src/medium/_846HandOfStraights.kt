package medium

import java.util.*

class _846HandOfStraights {
    class Solution {
        fun isNStraightHand(hand: IntArray, groupSize: Int): Boolean {
            val length = hand.size
            if (length % groupSize != 0) {
                return false
            }
            Arrays.sort(hand)
            val map = HashMap<Int, Int>()
            for (i in 0 until length) {
                map[hand[i]] = map.getOrDefault(hand[i], 0) + 1
            }
            for (i in 0 until length) {
                val x = hand[i]
                if (!map.containsKey(x)) {
                    continue
                }
                for (j in 0 until groupSize) {
                    val num = x + j
                    if (!map.containsKey(num)) {
                        return false
                    }
                    map[num] = map[num]!! - 1
                    if (map[num] == 0) {
                        map.remove(num)
                    }
                }
            }
            return true
        }
    }
}