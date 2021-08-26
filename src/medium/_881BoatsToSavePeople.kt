package medium

import java.util.*

class _881BoatsToSavePeople {
    class Solution {
        fun numRescueBoats(people: IntArray, limit: Int): Int {
            Arrays.sort(people)
            var left = 0
            var right = people.size - 1
            var ans = 0
            while (left <= right) {
                if ((people[left] + people[right]) <= limit) {
                    left++
                }
                right--
                ans++
            }
            return ans
        }
    }
}