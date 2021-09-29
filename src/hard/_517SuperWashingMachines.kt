package hard

import java.util.*

class _517SuperWashingMachines {
    class Solution {
        fun findMinMoves(machines: IntArray): Int {
            val total = Arrays.stream(machines).sum()
            val length = machines.size
            if (total % length != 0) {
                return -1
            }
            val avg = total / length
            var sum = 0
            var ans = 0
            for (i in machines.indices) {
                machines[i] -= avg
                sum += machines[i]
                ans = Math.max(ans, Math.max(Math.abs(sum), machines[i]))
            }
            return ans
        }
    }
}