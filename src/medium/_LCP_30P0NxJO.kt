package medium

import java.util.*


class _LCP_30P0NxJO {
    class Solution {
        fun magicTower(nums: IntArray): Int {
            val pq = PriorityQueue<Int>()
            var ans = 0
            var hp: Long = 1
            var delay: Long = 0
            for (num in nums) {
                if (num < 0) {
                    pq.offer(num)
                }
                hp += num.toLong()
                if (hp <= 0) {
                    ++ans
                    val curr = pq.poll()
                    delay += curr.toLong()
                    hp -= curr.toLong()
                }
            }
            hp += delay
            return if (hp <= 0) -1 else ans
        }
    }
}